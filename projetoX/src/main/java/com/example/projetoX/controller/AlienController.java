package com.example.projetoX.controller;

import com.example.projetoX.model.Alien;
import com.example.projetoX.model.Customer;
import com.example.projetoX.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/apiAlien")
public class AlienController {
    @Autowired
    AlienRepository alienR;

    @PostMapping ("/insertAlien")
    public void insertAlien(@RequestBody Alien alien){
        alienR.save(alien);
    }

    public void updateAlien(@RequestBody Alien alien){
        alienR.save(alien);
    }

    @DeleteMapping("/deleteAlien")
    public void deleteAlien(@RequestBody Alien alien){
        alienR.delete(alien);
    }

    @GetMapping ("/alien/{code}")
    public Optional<Alien> searchByCode(@PathVariable(value="code")int code) {
        return alienR.findById(code);
    }

    @GetMapping("/race/{race}")
    public List<Alien> listByRace(@PathVariable(value="race") String race){
        return alienR.findByRace(race);
    }

    @GetMapping("/description/{description}")
    public List<Alien> listByDescription (@PathVariable(value="description") String description){
        return alienR.findByDescription(description);
    }

    @GetMapping("/price/{price}")
    public List<Alien> listByPrice (@PathVariable(value="price") double price){
        return alienR.findByPrice(price);
    }
}
