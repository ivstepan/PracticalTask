package ru.mera.ivstepan.carshowroom.soap.service;

import ru.mera.ivstepan.carshowroom.soap.model.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "SoapService")
public interface SoapService {

    @WebMethod
    @WebResult(name = "createOrder")
    public void createOrder(@WebParam(name = "SaveOrderElement") SaveOrderElement orderElement);

    @WebMethod
    @WebResult(name = "updateOrder")
    public void updateOrder(@WebParam(name = "UpdateOrderElement") UpdateOrderElement updateOrderElement);

    @WebMethod
    @WebResult(name = "deleteOrder")
    public void deleteOrder(@WebParam(name = "DeleteOrderElement") DeleteOrderElement deleteOrderElement);

    @WebMethod
    @WebResult(name = "getAllOrders")
    public List<GetAllOrderElement> getAllOrders();

    @WebMethod
    @WebResult(name = "getCustomerOrders")
    public List<GetOrderResponseElement> getCustomerOrders(@WebParam(name = "GetOrderElement") GetOrderRequestElement getOrderRequestElement);

    @WebMethod
    @WebResult(name = "createCustomer")
    public void createCustomer(@WebParam(name = "SaveCustomerElement") SaveCustomerElement saveCustomerElement);

}
