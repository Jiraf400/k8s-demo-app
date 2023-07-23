package com.jirafik.cats.controller;

import com.jirafik.cats.dto.CatDto;
import com.jirafik.cats.entity.Cat;
import com.jirafik.cats.service.CatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService service;

    @GetMapping
    public String sayHello() {
        log.info("sayHello method called");
        return "Hello from cat cluster";
    }

    @PostMapping("/save")
    public Cat save(@RequestBody CatDto cat) {
        log.info("save method called");
        return service.save(cat);
    }

    @GetMapping("/getAll")
    public Iterable<Cat> getAll() {
        log.info("getAll method called");
        return service.getAll();
    }

}
