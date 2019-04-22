package ru.mera.ivstepan.carshowroom.rest.api;

import io.swagger.annotations.ApiParam;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import ru.mera.ivstepan.carshowroom.rest.model.*;
import ru.mera.ivstepan.carshowroom.rest.service.RestService;

import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T10:37:36.714+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.carshowroom.base-path:}")
public class ApiController implements Api {

    private static final Logger LOGGER = Logger.getLogger(ApiController.class);

    RestService restService;

    private final NativeWebRequest request;

    @RequestMapping(value = "/api/createOrder", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity apiCreateOrderPost(@RequestBody OrderDTO orderDTO) {
        try {
            restService.saveOrder(orderDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Order successfully saved.");
        } catch (Exception e) {
            LOGGER.debug("Error creating order", e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @RequestMapping(value = "/api/deleteOrder/{id}",
            method = RequestMethod.DELETE)
    public ResponseEntity apiDeleteOrderIdDelete(@ApiParam(value = "Deleted order id", required = true) @PathVariable("id") Integer id) {
        try {
            restService.deleteOrder(id);
            return ResponseEntity.status(HttpStatus.OK).body("Order successfully deleted.");
        } catch (Exception e) {
            LOGGER.debug("Error deleting order", e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @RequestMapping(value = "/api/getAllOrders",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<List<OrderDTO>> apiAllOrdersGet() {
        List<OrderDTO> list = restService.getAllOrders();
        return new ResponseEntity(list, HttpStatus.OK);

    }

    @RequestMapping(value = "/api/getCustomerOrders/{id}/{status}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<List<OrderDTO>> apiCustomerOrdersIdStatusGet(@ApiParam(value = "Customer id", required = true) @PathVariable("id") Integer id, @ApiParam(value = "Status order", required = true) @PathVariable("status") String status) {
        List<OrderDTO> list = restService.getCustomerOrders(id, status);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/createCustomer",
            consumes = {"application/json"},
            method = RequestMethod.POST)
    public ResponseEntity apiCreateCustomerPost(@ApiParam(value = "", required = true) @RequestBody CustomerDTO customerDTO) {
        try {
            restService.saveCustomer(customerDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Client successfully created.");
        } catch (Exception e) {
            LOGGER.debug("Error creating client", e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @RequestMapping(value = "/api/updateOrder",
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    public ResponseEntity apiUpdateOrderPut(@ApiParam(value = "", required = true) @RequestBody AutoDTO autoDTO) {
        try {
            restService.updateOrder(autoDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Order successfully updated.");
        } catch (Exception e) {
            LOGGER.debug("Order update error", e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @org.springframework.beans.factory.annotation.Autowired
    public ApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Autowired
    public void setRestServiceImpl(RestService restService) {
        this.restService = restService;
    }
}
