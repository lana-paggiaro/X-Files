package com.example.projetoX.repository;

import com.example.projetoX.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepository extends JpaRepository <Alien, Integer> {
}
