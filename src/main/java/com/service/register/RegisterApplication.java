package com.service.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : scottxuan
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RegisterApplication.class);
    }
}
