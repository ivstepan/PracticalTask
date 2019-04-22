package ru.mera.ivstepan.carshowroom.rest.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mera.ivstepan.carshowroom.rest.model.AutoDTO;
import ru.mera.ivstepan.carshowroom.rest.model.AutoOptionsDTO;
import ru.mera.ivstepan.carshowroom.rest.model.CustomerDTO;
import ru.mera.ivstepan.carshowroom.rest.model.OrderDTO;
import ru.mera.ivstepan.carshowroom.rest.repository.*;
import ru.mera.ivstepan.carshowroom.rest.entity.*;
import ru.mera.ivstepan.carshowroom.rest.service.RestService;
import ru.mera.ivstepan.carshowroom.rest.utils.OrderOptionslMap;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class RestServiceImpl implements RestService {

    private static final Logger LOGGER = Logger.getLogger(RestServiceImpl.class);

    private AutoRepository autoRepository;
    private OrderRepository orderRepository;
    private OptionsRepository optionsRepository;
    private OrderDetailRepository orderDetailRepository;
    private CustomerRepository customerRepository;

    private Customer customer;
    private Order order;
    private Auto auto;
    private OrderOptionslMap orderOptionslMap;

    public void saveOrder(OrderDTO orderDTO) {
        customer = new Customer();
        customer = customerRepository.findById(orderDTO.getCustomer().getCustomerId()).get();
        auto = autoRepository.findByBrandAndModel(orderDTO.getAuto().getBrand(), orderDTO.getAuto().getModel());
        order = new Order(auto, customer);
        orderRepository.saveAndFlush(order);
        LOGGER.debug("Data about the car and the client saved.");
        AutoOptionsDTO autoOptionsDTO = orderDTO.getAuto().getAutoOptionsElement();
        Options options = optionsRepository.findByAuto(auto);
        addOptions(autoOptionsDTO, options);
        LOGGER.debug("Selected options added to order. Order successfully saved.");
    }

    public void updateOrder(AutoDTO autoDTO) {
        order = orderRepository.findById(autoDTO.getOrderId()).get();
        auto = autoRepository.findByBrandAndModel(autoDTO.getBrand(), autoDTO.getModel());
        order.setAuto(auto);
        orderRepository.save(order);
        LOGGER.debug("Vehicle information updated.");
        orderDetailRepository.deleteOrderDetailByOrderId(order.getId());
        AutoOptionsDTO autoOptionsDTO = autoDTO.getAutoOptionsElement();
        Options options = optionsRepository.findByAuto(auto);
        addOptions(autoOptionsDTO, options);
        LOGGER.debug("Order successfully updated.");
    }

    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
        LOGGER.debug("Order successfully deleted.");
    }

    public List<OrderDTO> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return convertOrderToOrderDTO(orders);
    }

    public List<OrderDTO> getCustomerOrders(Integer id, String status) {
        List<Order> orders = orderRepository.selectOrdersByCustomerIdAndStatus(id, status);
        return convertOrderToOrderDTO(orders);
    }

    public void saveCustomer(CustomerDTO customerDTO) {
        Date birthday = null;
        try {
            birthday = new SimpleDateFormat("dd-MM-yyyy").parse(customerDTO.getBirthday());
        } catch (ParseException e) {
            LOGGER.debug("Invalid date entry format", e);
        }
        customer = new Customer(customerDTO.getFirstName(),
                customerDTO.getLastName(),
                birthday,
                customerDTO.getEmail());
        if (customerRepository.findByFirstNameAndLastNameAndEmail(customer.getFirstName(), customer.getLastName(), customer.getEmail()) == null) {
            customerRepository.saveAndFlush(customer);
            LOGGER.debug("Customer details saved successfully");
        } else
            LOGGER.debug("The buyer is already registered in the system.");
    }

    private void addOptions(AutoOptionsDTO autoOptionsDTO, Options options) {
        Map<String, Integer> priceOptions = orderOptionslMap.createMapOptionsPrice(options);
        Map<String, Boolean> customerSelectedOptions = orderOptionslMap.createMapSelectedAutoOptionsDTO(autoOptionsDTO);
        for (Map.Entry<String, Boolean> pair : customerSelectedOptions.entrySet()) {
            if (!pair.getValue()) {
                priceOptions.remove(pair.getKey());
            }
        }
        for (Map.Entry<String, Integer> pair : priceOptions.entrySet()) {
            OrderDetail orderDetail = new OrderDetail(pair.getKey(), pair.getValue(), order);
            orderDetailRepository.saveAndFlush(orderDetail);
        }
    }

    private List<OrderDTO> convertOrderToOrderDTO(List<Order> orders) {
        OrderDTO orderDTO;
        CustomerDTO customerDTO;
        AutoDTO autoDTO;
        List<OrderDTO> orderDTOList = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for (Order order : orders) {
            customerDTO = new CustomerDTO();
            customerDTO.setFirstName(order.getCustomer().getFirstName());
            customerDTO.setLastName(order.getCustomer().getLastName());
            customerDTO.setBirthday(df.format(order.getCustomer().getBirthday()));
            customerDTO.setEmail(order.getCustomer().getEmail());
            autoDTO = new AutoDTO();
            autoDTO.setBrand(order.getAuto().getBrand());
            autoDTO.setModel(order.getAuto().getModel());
            orderDTO = new OrderDTO();
            orderDTO.setId(order.getId());
            orderDTO.setStatus(OrderDTO.StatusEnum.valueOf(order.getStatus()));
            orderDTO.setDate(df.format(order.getDate()));
            orderDTO.setAuto(autoDTO);
            orderDTO.setCustomer(customerDTO);
            orderDTOList.add(orderDTO);
        }
        return orderDTOList;
    }

    @Autowired
    public void setAutoRepository(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Autowired
    public void setOptionsRepository(OptionsRepository optionsRepository) {
        this.optionsRepository = optionsRepository;
    }

    @Autowired
    public void setOrderDetailRepository(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setOrderOptionslMap(OrderOptionslMap orderOptionslMap) {
        this.orderOptionslMap = orderOptionslMap;
    }
}
