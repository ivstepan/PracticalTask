package ru.mera.ivstepan.carshowroom.soap.config;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.mera.ivstepan.carshowroom.soap.service.impl.SoapServiceImpl;
import ru.mera.ivstepan.carshowroom.soap.service.interseptors.AppInboundInterceptor;
import ru.mera.ivstepan.carshowroom.soap.service.interseptors.AppOutboundInterceptor;

import javax.xml.ws.Endpoint;

@Configuration
@EnableJpaRepositories("ru.mera.ivstepan.carshowroom.soap.repository")
public class CXFConfig {

    private SoapServiceImpl soapService;

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        SpringBus springBus = new SpringBus();
        springBus.getInInterceptors().add(new AppInboundInterceptor());
        springBus.getOutInterceptors().add(new AppOutboundInterceptor());
        return springBus;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), soapService);
        endpoint.getFeatures().add(new LoggingFeature());
        endpoint.publish("/SoapService");
        return endpoint;
    }

    @Autowired
    public void setSoapService(SoapServiceImpl soapService) {
        this.soapService = soapService;
    }

}
