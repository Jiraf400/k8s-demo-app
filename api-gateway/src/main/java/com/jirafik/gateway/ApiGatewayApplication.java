package com.jirafik.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        log.info("Initializing v1 cats-gateway: added rabbitmq to prop");
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
