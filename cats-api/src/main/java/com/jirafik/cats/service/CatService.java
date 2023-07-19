package com.jirafik.cats.service;

import com.jirafik.cats.dto.CatDto;
import com.jirafik.cats.entity.Cat;
import com.jirafik.cats.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(CatDto catDto) {
        log.info("save() method started.");
        Cat cat = Cat.builder()
                .name(catDto.getName())
                .birthDay(catDto.getBirthDay())
                .id(UUID.randomUUID().toString())
                .createdAt(LocalDateTime.now())
                .build();

        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        log.info("getAll() method started.");
        return catRepository.findAll();
    }

}
