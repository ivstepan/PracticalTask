package ru.mera.carshowroom.rest.shell;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellOption;
import ru.mera.carshowroom.rest.model.AutoDTO;
import ru.mera.carshowroom.rest.model.AutoOptionsDTO;
import ru.mera.carshowroom.rest.model.CustomerDTO;
import ru.mera.carshowroom.rest.model.OrderDTO;
import ru.mera.carshowroom.rest.service.ServiceRemoteCall;

import java.util.List;

@ShellComponent
public class CommandLine {

    private static final Logger LOGGER = Logger.getLogger(CommandLine.class);

    private ServiceRemoteCall serviceRemoteCall;

    private AutoOptionsDTO autoOptionsDTO;
    private CustomerDTO customerDTO;
    private AutoDTO autoDTO;

    @Autowired
    public void setServiceRemoteCall(ServiceRemoteCall serviceRemoteCall) {
        this.serviceRemoteCall = serviceRemoteCall;
    }

    // Example: save -cid 3 -bc VAZ -mc Kalina -hsp -ap
    @ShellMethod(value = "Save order. Arguments: -cid Integer customerId, -bc String brandCar, -mc String modelCar, and boolean options (" +
            "-hwp heatedWindshieldPrice, -hsp heatedSeatsPrice, -esp electricScootersPrice, -ap airbagsPrice, -fmp floorMatsPrice, -wtp winterTiresPrice)", key = "save")
    public void saveOrder(
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
        OrderDTO orderDTO = new OrderDTO();
        customerDTO = new CustomerDTO();
        autoOptionsDTO = new AutoOptionsDTO();
        autoDTO = new AutoDTO();

        customerDTO.setCustomerId(customerId);

        autoOptionsDTO.setHeatedWindshieldPrice(heatedWindshieldPrice);
        autoOptionsDTO.setHeatedSeatsPrice(heatedSeatsPrice);
        autoOptionsDTO.setElectricScootersPrice(electricScootersPrice);
        autoOptionsDTO.setAirbagsPrice(airbagsPrice);
        autoOptionsDTO.setFloorMatsPrice(floorMatsPrice);
        autoOptionsDTO.setWinterTiresPrice(winterTiresPrice);

        autoDTO.setBrand(brandCar);
        autoDTO.setModel(modelCar);
        autoDTO.setAutoOptionsElement(autoOptionsDTO);

        orderDTO.setCustomer(customerDTO);
        orderDTO.setAuto(autoDTO);

        LOGGER.debug("Submit a save Order.");
        System.out.println(serviceRemoteCall.saveOrder(orderDTO));
    }

    // Example: delete -id 3
    @ShellMethod(value = "Delete order. Arguments: -id Integer orderId", key = "delete")
    public void deleteOrder(@ShellOption("-id") Integer orderId) {
        LOGGER.debug("Send order removal request.");
        System.out.println(serviceRemoteCall.deleteOrder(orderId));
    }

    // Example: update -oid 5 -bc VAZ -mc Kalina -ap
    @ShellMethod(value = "Update order. Arguments: -oid Integer orderId, -bc String brandCar, -mc String modelCar, and boolean options (" +
            "-hwp heatedWindshieldPrice, -hsp heatedSeatsPrice, -esp electricScootersPrice, -ap airbagsPrice, -fmp floorMatsPrice, -wtp WinterTiresPrice)", key = "update")
    public void updateOrder(
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
        autoDTO = new AutoDTO();
        autoOptionsDTO = new AutoOptionsDTO();

        autoOptionsDTO.setHeatedWindshieldPrice(heatedWindshieldPrice);
        autoOptionsDTO.setHeatedSeatsPrice(heatedSeatsPrice);
        autoOptionsDTO.setElectricScootersPrice(electricScootersPrice);
        autoOptionsDTO.setAirbagsPrice(airbagsPrice);
        autoOptionsDTO.setFloorMatsPrice(floorMatsPrice);
        autoOptionsDTO.setWinterTiresPrice(WinterTiresPrice);

        autoDTO.setOrderId(orderId);
        autoDTO.setBrand(brandCar);
        autoDTO.setModel(modelCar);
        autoDTO.setAutoOptionsElement(autoOptionsDTO);

        LOGGER.debug("Send request to update the order data.");
        System.out.println(serviceRemoteCall.updateOrder(autoDTO));
    }

    // Example: savecustomer -fn Uncle -ln Fedor -e oldmanfedor@gmail.com -bd 23-05-1958
    @ShellMethod(value = "Save new customer. Arguments: -fn String firstName, -ln String lastName, -e String email, -bd String birthday", key = "savecustomer")
    public void saveCustomer(
            @ShellOption("-fn") String firstName,
            @ShellOption("-ln") String lastName,
            @ShellOption("-e") String email,
            @ShellOption("-bd") String birthday
    ) {
        customerDTO = new CustomerDTO();
        customerDTO.setFirstName(firstName);
        customerDTO.setLastName(lastName);
        customerDTO.setEmail(email);
        customerDTO.setBirthday(birthday);

        LOGGER.debug("Send a request to save customer data.");
        System.out.println(serviceRemoteCall.saveCustomer(customerDTO));
    }

    // Example: get -cid 4 -s RECEIVED
    @ShellMethod(value = "Get customer orders. Arguments: -cid Integer customerId, -s String status", key = "get")
    public void getCustomerOrders(@ShellOption("-cid") Integer customerId, @ShellOption("-s") OrderDTO.StatusEnum status) {
        LOGGER.debug("Send a request for obtaining customer data.");
        List<OrderDTO> list = serviceRemoteCall.getCustomerOrders(customerId, status);
        System.out.println(list.toString());
    }

    // Example: getall
    @ShellMethod(value = "Get all orders. Arguments: none", key = "getall")
    public void getAllOrders() {
        LOGGER.debug("Send a request for all orders.");
        List<OrderDTO> list = serviceRemoteCall.getAllOrders();
        System.out.println(list.toString());
    }



}