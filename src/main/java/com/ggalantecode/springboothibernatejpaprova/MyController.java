package com.ggalantecode.springboothibernatejpaprova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class MyController {

    @Autowired
    ProvaPrimaryKeyGenRepository repository;

    @GetMapping
    public List<ProvaPrimaryKeyGenEntity> hello() {
        List<ProvaPrimaryKeyGenEntity> entities = repository.findAll();
        entities.stream().map(e -> e.getId()).forEach(System.out::println);
        entities.forEach(System.out::println);
        return entities;
    }

}
