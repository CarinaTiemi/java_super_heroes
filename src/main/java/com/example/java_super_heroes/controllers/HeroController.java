package com.example.java_super_heroes.controllers;

import java.util.List;

import com.example.java_super_heroes.models.Hero;
import com.example.java_super_heroes.services.HeroService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class HeroController {

    private HeroService heroService;

    @GetMapping
    public List<Hero> findAll(){
        return heroService.findAll();
    }
}
