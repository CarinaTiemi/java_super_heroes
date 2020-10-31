package com.example.java_super_heroes.repository;

import com.example.java_super_heroes.models.Hero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
    
}
