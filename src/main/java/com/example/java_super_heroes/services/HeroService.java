package com.example.java_super_heroes.services;

import java.util.List;

import com.example.java_super_heroes.models.Hero;
import com.example.java_super_heroes.repository.HeroRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HeroService {
    
    private HeroRepository heroRepository;

    public List<Hero> findAll() {
        return heroRepository.findAll();

    }
}
