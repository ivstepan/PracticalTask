package ru.mera.carshowroom.soap.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mera.ivstepan.carshowroom.soap.service.*;
import ru.mera.ivstepan.carshowroom.soap.service.impl.SoapService;

import java.util.List;

@Service
public class ServiceRemoteCall {

    private SoapService soapService;

    public void saveOrder(SaveOrderElement saveOrderElement) {
        soapService.createOrder(saveOrderElement);
    }

    public void updateOrder(UpdateOrderElement updateOrderElement) {
        soapService.updateOrder(updateOrderElement);
    }

    public void deleteOrder(DeleteOrderElement deleteOrderElement) {
        soapService.deleteOrder(deleteOrderElement);
    }

    public List<GetAllOrderElement> getAllOrders() {
        return soapService.getAllOrders();
    }

    public List<GetOrderResponseElement> getCustomerOrders(GetOrderRequestElement getOrderRequestElement) {
        return soapService.getCustomerOrders(getOrderRequestElement);
    }

    public void saveCustomer(SaveCustomerElement saveCustomerElement) {
        soapService.createCustomer(saveCustomerElement);
    }

    @Autowired
    public void setSoapService(SoapService soapService) {
        this.soapService = soapService;
    }
}
