package ru.mera.carshowroom.soap.client.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mera.ivstepan.carshowroom.soap.service.impl.SoapService;
import ru.mera.ivstepan.carshowroom.soap.service.impl.SoapServiceImplService;

@Configuration
public class ClientConfig {

    @Autowired
    SoapService soapService;

    @Bean
    public SoapService createSoapServiceProxy() {
        SoapServiceImplService soapServiceImplService = new SoapServiceImplService();
        SoapService soapService = soapServiceImplService.getSoapServiceImplPort();
        return soapService;
    }
}