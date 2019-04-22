package ru.mera.carshowroom.soap.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// wsimport -keep http://localhost:9000/services/SoapService?wsdl

@SpringBootApplication
public class SoapclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapclientApplication.class, args);
    }

}