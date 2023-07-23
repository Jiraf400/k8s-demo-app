package com.jirafik.cats;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CatsApiApplication {

    public static void main(String[] args) {
        log.info("Start initialization v1");
        SpringApplication.run(CatsApiApplication.class, args);
        log.info("Initialized successfully 1");
    }

}
