package ru.mera.carshowroom.rest.service.impl;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.mera.carshowroom.rest.model.AutoDTO;
import ru.mera.carshowroom.rest.model.CustomerDTO;
import ru.mera.carshowroom.rest.model.OrderDTO;
import ru.mera.carshowroom.rest.service.ServiceRemoteCall;

import java.util.List;

@Service
public class ServiceRemoteCallImpl implements ServiceRemoteCall {

    private final WebClient webClient;

    public ServiceRemoteCallImpl(WebClient.Builder webClientBuilder) {
        this.webClient = WebClient.builder()
                .baseUrl("http://localhost:8081")
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public String saveOrder(OrderDTO orderDTO) {
        return webClient.post()
                .uri("/api/createOrder")
                .body(Mono.just(orderDTO), OrderDTO.class)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    @Override
    public String updateOrder(AutoDTO autoDTO) {
        return webClient.put()
                .uri("/api/updateOrder")
                .body(Mono.just(autoDTO), AutoDTO.class)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    @Override
    public String deleteOrder(Integer id) {
        return webClient.delete()
                .uri("/api/deleteOrder/{id}", id)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        Flux<OrderDTO> orderFlux = webClient.get()
                .uri("/api/getAllOrders")
                .retrieve().bodyToFlux(OrderDTO.class);
        return orderFlux.collectList().block();
    }

    @Override
    public List<OrderDTO> getCustomerOrders(Integer id, OrderDTO.StatusEnum status) {
        Flux<OrderDTO> orderFlux = webClient.get()
                .uri("/api/getCustomerOrders/{id}/{status}", id, status)
                .retrieve().bodyToFlux(OrderDTO.class);
        return orderFlux.collectList().block();
    }

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        return webClient.post()
                .uri("/api/createCustomer")
                .body(Mono.just(customerDTO), CustomerDTO.class)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}

//
//public class ServiceRemoteCallImpl {
//
//            private final WebClient webClient;
//
//            public ServiceRemoteCallImpl(WebClient.Builder webClientBuilder) {
//                this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
//            }
//
//            public List<Order> getAllOrders() {
//                Flux<Order> orderFlux = webClient.get().uri("/orders").retrieve().bodyToFlux(Order.class);
//                return orderFlux.collectList().block();
//            }
//
//            public Order getOrderById(long id) {
//                return webClient.get().uri("/orders/{id}", id).retrieve().bodyToMono(Order.class).block();
//            }
//
//            public String createNewOrder(long carId, long customerId) {
//                Order order = new Order(carId, customerId);
////        return webClient.post().uri("/orders").body(Mono.just(order), Order.class).accept(MediaType.TEXT_PLAIN).exchange().block();
//                return webClient.post().uri("/orders").body(Mono.just(order), Order.class).retrieve().bodyToMono(String.class).block();
//
//            }
//
//            public String deleteOrder(long id) {
//                return webClient.delete().uri("/orders/{id}", id).retrieve().bodyToMono(String.class).block();
//            }
//
//            public String updateOrder(long id, String status) {
//                return webClient.put().uri("/orders/{id}", id).body(Mono.just(status), String.class).retrieve().bodyToMono(String.class).block();
//            }
//
//            public List<Order> getOrdersByCustomerIdAndStatus(long customerId, String status) {
//                return webClient.get().uri("/orders/status?customerId={customerId}&status={status}", customerId, status).retrieve().bodyToFlux(Order.class).collectList().block();
//            }
//        }


//@PostMapping
//public ResponseEntity createOrder(@RequestBody Order order) {
//            try {
//
//                logger.info("attempt to create a new order: " + order.toString());
//                order.setDate(new Date());
//                order.setStatus(OrderStatus.ACCEPTED.getStatus());
//                orderService.createOrder(order);
//                return ResponseEntity.status(HttpStatus.CREATED).body("order was successfully created");
//            } catch (Exception e) {
//                logger.error("unable to create a new order: " + e.getMessage());
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//            }
//        }