package com.example.projetoX.repository;

import com.example.projetoX.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlienRepository extends JpaRepository <Alien, Integer> {
    public List<Alien> findByRace (String race);

    public List<Alien> findByDescription (String description);

    public List<Alien> findByPrice (double price);
}
