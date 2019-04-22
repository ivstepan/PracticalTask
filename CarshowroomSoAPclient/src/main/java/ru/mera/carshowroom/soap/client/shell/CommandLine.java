package ru.mera.carshowroom.soap.client.shell;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellOption;
import ru.mera.carshowroom.soap.client.service.ServiceRemoteCall;
import ru.mera.ivstepan.carshowroom.soap.service.*;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@ShellComponent
public class CommandLine {

    private static final Logger LOGGER = Logger.getLogger(CommandLine.class);

    private ServiceRemoteCall serviceRemoteCall;

    @Autowired
    public void setServiceRemoteCall(ServiceRemoteCall serviceRemoteCall) {
        this.serviceRemoteCall = serviceRemoteCall;
    }

    // Example: save -cid 2 -bc Audi -mc A6 -fmp -wtp
    @ShellMethod(value = "Save order. Arguments: -cid Integer customerId, -bc String brandCar, -mc String modelCar, and boolean options (" +
            "-hwp heatedWindshieldPrice, -hsp heatedSeatsPrice, -esp electricScootersPrice, -ap airbagsPrice, -fmp floorMatsPrice, -wtp winterTiresPrice)", key = "save")
    public String saveOrder(
            @ShellOption("-cid") Integer customerId,
            @ShellOption("-bc") String brandCar,
            @ShellOption("-mc") String modelCar,
            @ShellOption(value = "-hwp") boolean heatedWindshieldPrice,
            @ShellOption(value = "-hsp") boolean heatedSeatsPrice,
            @ShellOption(value = "-esp") boolean electricScootersPrice,
            @ShellOption(value = "-ap") boolean airbagsPrice,
            @ShellOption(value = "-fmp") boolean floorMatsPrice,
            @ShellOption(value = "-wtp") boolean winterTiresPrice
    ) {
        SaveOrderElement saveOrderElement = new SaveOrderElement();
        AutoOptionsElement autoOptionsElement = new AutoOptionsElement();
        saveOrderElement.setCustomerId(customerId);
        saveOrderElement.setBrand(brandCar);
        saveOrderElement.setModel(modelCar);
        saveOrderElement.setAutoOptionsElement(autoOptionsElement);
        saveOrderElement.getAutoOptionsElement().setHeatedWindshieldPrice(heatedWindshieldPrice);
        saveOrderElement.getAutoOptionsElement().setHeatedSeatsPrice(heatedSeatsPrice);
        saveOrderElement.getAutoOptionsElement().setElectricScootersPrice(electricScootersPrice);
        saveOrderElement.getAutoOptionsElement().setAirbagsPrice(airbagsPrice);
        saveOrderElement.getAutoOptionsElement().setFloorMatsPrice(floorMatsPrice);
        saveOrderElement.getAutoOptionsElement().setWinterTiresPrice(winterTiresPrice);
        LOGGER.debug("Request to create an order.");
        serviceRemoteCall.saveOrder(saveOrderElement);
        return "Order successfully saved.";
    }

    // Example: update -oid 5 -bc VAZ -mc Granta -ap
    @ShellMethod(value = "Update order. Arguments: -oid Integer orderId, -bc String brandCar, -mc String modelCar, and boolean options (" +
            "-hwp heatedWindshieldPrice, -hsp heatedSeatsPrice, -esp electricScootersPrice, -ap airbagsPrice, -fmp floorMatsPrice, -wtp WinterTiresPrice)", key = "update")
    public String updateOrder(
            @ShellOption("-oid") Integer orderId,
            @ShellOption("-bc") String brandCar,
            @ShellOption("-mc") String modelCar,
            @ShellOption(value = "-hwp") boolean heatedWindshieldPrice,
            @ShellOption(value = "-hsp") boolean heatedSeatsPrice,
            @ShellOption(value = "-esp") boolean electricScootersPrice,
            @ShellOption(value = "-ap") boolean airbagsPrice,
            @ShellOption(value = "-fmp") boolean floorMatsPrice,
            @ShellOption(value = "-wtp") boolean WinterTiresPrice
    ) {
        UpdateOrderElement updateOrderElement = new UpdateOrderElement();
        AutoOptionsElement autoOptionsElement = new AutoOptionsElement();
        updateOrderElement.setOrderId(orderId);
        updateOrderElement.setBrand(brandCar);
        updateOrderElement.setModel(modelCar);
        updateOrderElement.setAutoOptionsElement(autoOptionsElement);
        updateOrderElement.getAutoOptionsElement().setHeatedWindshieldPrice(heatedWindshieldPrice);
        updateOrderElement.getAutoOptionsElement().setHeatedSeatsPrice(heatedSeatsPrice);
        updateOrderElement.getAutoOptionsElement().setElectricScootersPrice(electricScootersPrice);
        updateOrderElement.getAutoOptionsElement().setAirbagsPrice(airbagsPrice);
        updateOrderElement.getAutoOptionsElement().setFloorMatsPrice(floorMatsPrice);
        updateOrderElement.getAutoOptionsElement().setWinterTiresPrice(WinterTiresPrice);
        LOGGER.debug("Request for updating order data.");
        serviceRemoteCall.updateOrder(updateOrderElement);
        return "Order successfully updated.";
    }

    // Example: savecustomer -fn John -ln Doe -e johndoe@gmail.com -bd 22-10-1970
    @ShellMethod(value = "Save new customer. Arguments: -fn String firstName, -ln String lastName, -e String email, -bd String birthday", key = "savecustomer")
    public String saveCustomer(
            @ShellOption("-fn") String firstName,
            @ShellOption("-ln") String lastName,
            @ShellOption("-e") String email,
            @ShellOption("-bd") String birthday
    ) {
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        XMLGregorianCalendar xmlDate = null;
        try {
            Date date = format.parse(birthday);
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(date);
            xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (ParseException e) {
            LOGGER.debug("Invalid date entry format", e);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        SaveCustomerElement saveCustomerElement = new SaveCustomerElement();
        saveCustomerElement.setCustomerFirstName(firstName);
        saveCustomerElement.setCustomerLastName(lastName);
        saveCustomerElement.setCustomerEmail(email);
        saveCustomerElement.setDate(xmlDate);
        LOGGER.debug("Request to save customer data.");
        serviceRemoteCall.saveCustomer(saveCustomerElement);
        return "Customer details saved successfully";
    }

    // Example: delete -id 1
    @ShellMethod(value = "Delete order. Arguments: -id Integer orderId", key = "delete")
    public String deleteOrder(@ShellOption("-id") Integer orderId) {
        DeleteOrderElement deleteOrderElement = new DeleteOrderElement();
        deleteOrderElement.setOrderId(orderId);
        LOGGER.debug("Request to delete an order.");
        serviceRemoteCall.deleteOrder(deleteOrderElement);
        return "Order successfully deleted.";
    }

    // Example: get -cid 4 -s RECEIVED
    @ShellMethod(value = "Get customer orders. Arguments: -cid Integer customerId, -s String status", key = "get")
    public void getCustomerOrders(@ShellOption("-cid") Integer customerId, @ShellOption("-s") String status) {
        GetOrderRequestElement getOrderRequestElement = new GetOrderRequestElement();
        getOrderRequestElement.setCustomerId(customerId);
        getOrderRequestElement.setStatus(status);
        ObjectFactory factory = new ObjectFactory();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(GetOrderResponseElement.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            LOGGER.debug("Request for Sales Orders.");
            List<GetOrderResponseElement> getOrderResponseElements = serviceRemoteCall.getCustomerOrders(getOrderRequestElement);
            for (GetOrderResponseElement order : getOrderResponseElements) {
                javax.xml.bind.JAXBElement<GetOrderResponseElement> myRootElement = factory.createGetOrderResponseElement(order);
                jaxbMarshaller.marshal(myRootElement, System.out);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    // Example: getall
    @ShellMethod(value = "Get all orders. Arguments: none", key = "getall")
    public void getAllOrders() {
        GetAllOrderElement getOrderRequestElement = new GetAllOrderElement();
        ObjectFactory factory = new ObjectFactory();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(GetAllOrderElement.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            LOGGER.debug("Request for all orders.");
            List<GetAllOrderElement> getAllOrderElements = serviceRemoteCall.getAllOrders();
            for (GetAllOrderElement order : getAllOrderElements) {
                javax.xml.bind.JAXBElement<GetAllOrderElement> myRootElement = factory.createGetAllOrderElement(order);
                jaxbMarshaller.marshal(myRootElement, System.out);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}