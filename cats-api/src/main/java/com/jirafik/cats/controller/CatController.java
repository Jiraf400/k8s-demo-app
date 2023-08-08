package com.jirafik.cats.controller;

import com.jirafik.cats.broker.consumer.RabbitConsumer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("api/cats")
@RequiredArgsConstructor
public class CatController {

    private final RabbitConsumer consumer;

    @GetMapping("/secured/hello")
    public String sayHello() {
        log.info("private sayHello method called");
        return "<h2> Hello " + consumer.getUser().getUsername() + ".\nToday: " + new Date() + "</h2>";
    }

    @GetMapping("/hello")
    public String sayPublicHello() {
        log.info("sayHello method called");
        return "<h2> Hello anonymous. " + new Date() + "</h2>";
    }

}
