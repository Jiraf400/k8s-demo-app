package com.jirafik.cats;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class CatsApiApplication {

    public static void main(String[] args) {
        log.info("Start initialization v1");
        SpringApplication.run(CatsApiApplication.class, args);
        log.info("Initialized successfully 1");
    }

}
