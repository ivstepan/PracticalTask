/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ru.mera.ivstepan.carshowroom.rest.api;

import ru.mera.ivstepan.carshowroom.rest.model.AutoDTO;
import ru.mera.ivstepan.carshowroom.rest.model.CustomerDTO;
import ru.mera.ivstepan.carshowroom.rest.model.OrderDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T14:19:14.556+03:00[Europe/Moscow]")

@Validated
@io.swagger.annotations.Api(value = "api", description = "the api API")
public interface Api {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Get all orders", nickname = "apiAllOrdersGet", notes = "Get all existing orders with customer data, brand and model of the selected vehicle", response = OrderDTO.class, responseContainer = "List", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = OrderDTO.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "NOK"),
            @ApiResponse(code = 404, message = "NOT FOUND"),
            @ApiResponse(code = 500, message = "INTERNAL ERROR")})
    @RequestMapping(value = "/api/getAllOrders",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<List<OrderDTO>> apiAllOrdersGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"date\" : \"date\",  \"auto\" : {    \"orderId\" : 1,    \"customerId\" : 1,    \"model\" : \"A6\",    \"autoOptionsElement\" : {      \"heatedWindshieldPrice\" : false,      \"airbagsPrice\" : false,      \"winterTiresPrice\" : false,      \"electricScootersPrice\" : false,      \"floorMatsPrice\" : false,      \"heatedSeatsPrice\" : false    },    \"brand\" : \"Audi\"  },  \"id\" : 1,  \"status\" : \"RECEIVED\",  \"customer\" : {    \"birthday\" : \"1985-05-23\",    \"firstName\" : \"Flint\",    \"lastName\" : \"Capitan\",    \"customerId\" : 1,    \"email\" : \"tortuga@island.com\"  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    @ApiOperation(value = "Create customer", nickname = "apiCreateCustomerPost", notes = "Save the first name, last name, email and date of birth of the client", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "NOK"),
            @ApiResponse(code = 404, message = "NOT FOUND"),
            @ApiResponse(code = 500, message = "INTERNAL ERROR")})
    @RequestMapping(value = "/api/createCustomer",
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<Void> apiCreateCustomerPost(@ApiParam(value = "", required = true) @RequestBody CustomerDTO customerDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    @ApiOperation(value = "Create new order", nickname = "apiCreateOrderPost", notes = "Save selected brand, car model and advanced options", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "NOK"),
            @ApiResponse(code = 404, message = "NOT FOUND"),
            @ApiResponse(code = 500, message = "INTERNAL ERROR")})
    @RequestMapping(value = "/api/createOrder",
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<Void> apiCreateOrderPost(@ApiParam(value = "", required = true) @RequestBody OrderDTO orderDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    @ApiOperation(value = "Get a customer order", nickname = "apiCustomerOrdersIdStatusGet", notes = "Get all orders of the selected client by order status with indication of customer data, brand and model of the selected car", response = OrderDTO.class, responseContainer = "List", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = OrderDTO.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "NOK"),
            @ApiResponse(code = 404, message = "NOT FOUND"),
            @ApiResponse(code = 500, message = "INTERNAL ERROR")})
    @RequestMapping(value = "/api/getCustomerOrders/{id}/{status}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<List<OrderDTO>> apiCustomerOrdersIdStatusGet(@ApiParam(value = "Customer id", required = true) @PathVariable("id") Integer id, @ApiParam(value = "Status order", required = true) @PathVariable("status") String status) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"date\" : \"date\",  \"auto\" : {    \"orderId\" : 1,    \"customerId\" : 1,    \"model\" : \"A6\",    \"autoOptionsElement\" : {      \"heatedWindshieldPrice\" : false,      \"airbagsPrice\" : false,      \"winterTiresPrice\" : false,      \"electricScootersPrice\" : false,      \"floorMatsPrice\" : false,      \"heatedSeatsPrice\" : false    },    \"brand\" : \"Audi\"  },  \"id\" : 1,  \"status\" : \"RECEIVED\",  \"customer\" : {    \"birthday\" : \"1985-05-23\",    \"firstName\" : \"Flint\",    \"lastName\" : \"Capitan\",    \"customerId\" : 1,    \"email\" : \"tortuga@island.com\"  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    @ApiOperation(value = "Delete existing order", nickname = "apiDeleteOrderIdDelete", notes = "Delete all transferred order data", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "NOK"),
            @ApiResponse(code = 404, message = "NOT FOUND"),
            @ApiResponse(code = 500, message = "INTERNAL ERROR")})
    @RequestMapping(value = "/api/deleteOrder/{id}",
            method = RequestMethod.DELETE)
    default ResponseEntity<Void> apiDeleteOrderIdDelete(@ApiParam(value = "Deleted order id", required = true) @PathVariable("id") Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    @ApiOperation(value = "Update existing order", nickname = "apiUpdateOrderPut", notes = "Update brand, car model or advanced options", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "NOK"),
            @ApiResponse(code = 404, message = "NOT FOUND"),
            @ApiResponse(code = 500, message = "INTERNAL ERROR")})
    @RequestMapping(value = "/api/updateOrder",
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    default ResponseEntity<Void> apiUpdateOrderPut(@ApiParam(value = "", required = true) @RequestBody AutoDTO autoDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
