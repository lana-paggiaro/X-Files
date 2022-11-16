package com.example.projetoX.repository;

import com.example.projetoX.model.Alien;
import com.example.projetoX.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlienRepository extends JpaRepository <Alien, Integer> {
    public List<Alien> findByType (String type);

    public List<Alien> findByDescription (String description);

    @Query("SELECT a FROM Alien a WHERE LOWER(a.type) LIKE ?1%")
    public List<Alien> findByTypeInitial(String type);

    @Query("SELECT a FROM Alien a WHERE LOWER(a.description) LIKE ?1%")
    public List<Alien> findByDescriptionInitial(String description);

    public List<Alien> findByPrice (double price);

    @Query(value="SELECT a FROM Alien a WHERE a.price > ?1")
    public List<Alien> findByMajorPrice (double price);

    @Query(value="SELECT a FROM Alien a WHERE a.price < ?1")
    public List<Alien> findByMinorPrice (double price);

    @Query("SELECT a FROM Alien a WHERE LOWER(a.description) LIKE ?1% AND LOWER(a.type) LIKE ?2%")
    public List<Alien> findByDescriptionAndType(String description, String type);

    @Query("SELECT a FROM Alien a WHERE LOWER(a.description) LIKE ?1% AND a.price < ?2")
    public List<Alien> findByDescriptionAndPrice(String description, double price);
}
