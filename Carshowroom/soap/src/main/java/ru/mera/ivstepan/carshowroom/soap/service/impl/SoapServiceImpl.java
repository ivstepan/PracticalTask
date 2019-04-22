package ru.mera.ivstepan.carshowroom.soap.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mera.ivstepan.carshowroom.soap.entity.*;
import ru.mera.ivstepan.carshowroom.soap.model.*;
import ru.mera.ivstepan.carshowroom.soap.repository.*;
import ru.mera.ivstepan.carshowroom.soap.service.SoapService;
import ru.mera.ivstepan.carshowroom.soap.utils.OrderDetailMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SoapServiceImpl implements SoapService {

    private static final Logger LOGGER = Logger.getLogger(SoapServiceImpl.class);

    private AutoRepository autoRepository;
    private OrderRepository orderRepository;
    private OptionsRepository optionsRepository;
    private OrderDetailRepository orderDetailRepository;
    private CustomerRepository customerRepository;

    private Order order;
    private Customer customer;
    private Auto auto;
    private OrderDetail orderDetail;
    private OrderDetailMap orderDetailMap;

    private Map<String, Boolean> customerSelectedOptions;
    private Map<String, Integer> priceOptions;

    @Override
    public void createOrder(SaveOrderElement saveOrderElement) {
        auto = autoRepository.findByBrandAndModel(saveOrderElement.getBrand(), saveOrderElement.getModel());
        customer = customerRepository.findById(saveOrderElement.getCustomerId()).get();
        order = new Order(auto, customer);
        orderRepository.saveAndFlush(order);
        LOGGER.debug("Data about the car and the client saved.");
        Options options = optionsRepository.findByAuto(auto);
        priceOptions = orderDetailMap.createMapOptionsPrice(options);
        customerSelectedOptions = orderDetailMap.createMapSelectedAutoOptions(saveOrderElement.getAutoOptionsElement());
        for (Map.Entry<String, Boolean> pair : customerSelectedOptions.entrySet()) {
            if (!pair.getValue()) {
                priceOptions.remove(pair.getKey());
            }
        }
        for (Map.Entry<String, Integer> pair : priceOptions.entrySet()) {
            orderDetail = new OrderDetail(pair.getKey(), pair.getValue(), order);
            orderDetailRepository.saveAndFlush(orderDetail);
            LOGGER.debug("Selected options added to order.");
        }
        LOGGER.debug("Order successfully saved.");
    }

    @Override
    public void updateOrder(UpdateOrderElement updateOrderElement) {
        order = orderRepository.findById(updateOrderElement.getOrderId()).get();
        auto = autoRepository.findByBrandAndModel(updateOrderElement.getBrand(), updateOrderElement.getModel());
        order.setAuto(auto);
        orderRepository.save(order);
        LOGGER.debug("Vehicle information updated.");
        orderDetailRepository.deleteOrderDetailByOrderId(order.getId());
        Options options = optionsRepository.findByAuto(auto);
        priceOptions = orderDetailMap.createMapOptionsPrice(options);
        customerSelectedOptions = orderDetailMap.createMapSelectedAutoOptions(updateOrderElement.getAutoOptionsElement());
        for (Map.Entry<String, Boolean> pair : customerSelectedOptions.entrySet()) {
            if (!pair.getValue()) {
                priceOptions.remove(pair.getKey());
            }
        }
        for (Map.Entry<String, Integer> pair : priceOptions.entrySet()) {
            orderDetail = new OrderDetail(pair.getKey(), pair.getValue(), order);
            orderDetailRepository.saveAndFlush(orderDetail);
            LOGGER.debug("Data on additional options to order updated.");
        }
        LOGGER.debug("Order successfully updated.");
    }

    @Override
    public List<GetAllOrderElement> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        List<GetAllOrderElement> getAllOrderElements = new ArrayList<>();
        for (Order order : orders) {
            GetAllOrderElement getAllOrderElement = new GetAllOrderElement();
            OrderElement orderElement = new OrderElement();
            CustomerElement customerElement = new CustomerElement();
            getAllOrderElement.setId(order.getId());
            getAllOrderElement.setDate(order.getDate());
            customerElement.setCustomerFirstName(order.getCustomer().getFirstName());
            customerElement.setCustomerLastName(order.getCustomer().getLastName());
            customerElement.setCustomerEmail(order.getCustomer().getEmail());
            customerElement.setBirthday(order.getCustomer().getBirthday());
            orderElement.setCustomerElement(customerElement);
            orderElement.setId(order.getId());
            orderElement.setBrand(order.getAuto().getBrand());
            orderElement.setModel(order.getAuto().getModel());
            getAllOrderElement.setOrder(orderElement);
            getAllOrderElements.add(getAllOrderElement);
        }
        LOGGER.debug("Getting a list of all orders successfully.");
        return getAllOrderElements;
    }

    @Override
    public List<GetOrderResponseElement> getCustomerOrders(GetOrderRequestElement getOrderRequestElement) {
        List<Order> orders = orderRepository.selectOrdersByCustomerIdAndStatus(getOrderRequestElement.getCustomerId(), getOrderRequestElement.getStatus());
        List<GetOrderResponseElement> getOrderResponseElementList = new ArrayList<>();
        for (Order order : orders) {
            GetOrderResponseElement getOrderResponseElement = new GetOrderResponseElement();
            OrderElement orderElement = new OrderElement();
            CustomerElement customerElement = new CustomerElement();
            getOrderResponseElement.setOrderId(order.getId());
            getOrderResponseElement.setStatus(order.getStatus());
            getOrderResponseElement.setDate(order.getDate());
            customerElement.setCustomerFirstName(order.getCustomer().getFirstName());
            customerElement.setCustomerLastName(order.getCustomer().getLastName());
            customerElement.setCustomerEmail(order.getCustomer().getEmail());
            customerElement.setBirthday(order.getCustomer().getBirthday());
            orderElement.setCustomerElement(customerElement);
            orderElement.setBrand(order.getAuto().getBrand());
            orderElement.setModel(order.getAuto().getModel());
            getOrderResponseElement.setOrder(orderElement);
            getOrderResponseElementList.add(getOrderResponseElement);
        }
        LOGGER.debug("Getting a list of customer orders successfully.");
        return getOrderResponseElementList;
    }

    @Override
    public void createCustomer(SaveCustomerElement saveCustomerElement) {
        customer = new Customer(saveCustomerElement.getCustomerFirstName(),
                saveCustomerElement.getCustomerLastName(),
                saveCustomerElement.getBirthday(),
                saveCustomerElement.getCustomerEmail());
        if (customerRepository.findByFirstNameAndLastNameAndEmail(customer.getFirstName(), customer.getLastName(), customer.getEmail()) == null) {
            customerRepository.saveAndFlush(customer);
            LOGGER.debug("Customer details saved successfully");
        } else
            LOGGER.debug("The buyer is already registered in the system.");
    }

    @Override
    public void deleteOrder(DeleteOrderElement deleteOrderElement) {
        orderRepository.deleteById(deleteOrderElement.getOrderId());
        LOGGER.debug("Order successfully deleted.");
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
    public void setOrderDetailMap(OrderDetailMap orderDetailMap) {
        this.orderDetailMap = orderDetailMap;
    }
}

