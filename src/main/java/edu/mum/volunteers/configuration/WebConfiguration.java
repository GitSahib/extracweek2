package edu.mum.volunteers.configuration;

import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebdavServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}
