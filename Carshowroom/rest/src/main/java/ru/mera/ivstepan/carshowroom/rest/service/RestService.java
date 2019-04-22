package ru.mera.ivstepan.carshowroom.rest.service;

import org.springframework.stereotype.Service;
import ru.mera.ivstepan.carshowroom.rest.model.AutoDTO;
import ru.mera.ivstepan.carshowroom.rest.model.CustomerDTO;
import ru.mera.ivstepan.carshowroom.rest.model.OrderDTO;

import java.util.List;

@Service
public interface RestService {

    public void saveOrder(OrderDTO orderDTO);

    public void updateOrder(AutoDTO autoDTO);

    public void deleteOrder(Integer id);

    public List<OrderDTO> getAllOrders();

    public List<OrderDTO> getCustomerOrders(Integer id, String status);

    public void saveCustomer(CustomerDTO customerDTO);
}
