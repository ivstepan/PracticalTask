package ru.mera.carshowroom.rest.service;

import org.springframework.stereotype.Service;
import ru.mera.carshowroom.rest.model.AutoDTO;
import ru.mera.carshowroom.rest.model.CustomerDTO;
import ru.mera.carshowroom.rest.model.OrderDTO;

import java.util.List;

@Service
public interface ServiceRemoteCall {

    public String saveOrder(OrderDTO orderDTO);

    public String updateOrder(AutoDTO autoDTO);

    public String deleteOrder(Integer id);

    public List<OrderDTO> getAllOrders();

    public List<OrderDTO> getCustomerOrders(Integer id, OrderDTO.StatusEnum status);

    public String saveCustomer(CustomerDTO customerDTO);

}
