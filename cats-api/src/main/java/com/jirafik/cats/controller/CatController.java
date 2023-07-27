package com.jirafik.cats.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("api/cats")
@RequiredArgsConstructor
public class CatController {

    @GetMapping("/hello")
    public String sayHello() {
        log.info("sayHello method called");
        return "<h2> Hello anonymous. " + new Date() + "</h2>";
    }

//    @PostMapping("/save")
//    public Cat save(@RequestBody CatDto cat) {
//        log.info("save method called");
//        return service.save(cat);
//    }
//
//    @GetMapping("/getAll")
//    public Iterable<Cat> getAll() {
//        log.info("getAll method called");
//        return service.getAll();
//    }

}
