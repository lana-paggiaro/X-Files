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

    @GetMapping(value="/allAliens")
    public List<Alien> searchAll (){
        return alienR.findAll();
    }

    @GetMapping ("/searchCode/{code}")
    public Optional<Alien> searchByCode(@PathVariable(value="code")int code) {
        return alienR.findById(code);
    }

    @GetMapping("/searchType/{type}")
    public List<Alien> listByType(@PathVariable(value="type") String type){
        return alienR.findByType(type);
    }

    @GetMapping("/searchDescription/{description}")
    public List<Alien> listByDescription (@PathVariable(value="description") String description){
        return alienR.findByDescription(description);
    }

    @GetMapping("/searchPrice/{price}")
    public List<Alien> listByPrice (@PathVariable(value="price") double price){
        return alienR.findByPrice(price);
    }

    @GetMapping("/initialType/{type}")
    public List<Alien> listByTypeInitial (@PathVariable(value="type") String type){
        return alienR.findByTypeInitial(type);
    }

    @GetMapping("/initialDescription/{description}")
    public List<Alien> listByDescriptionInitial(@PathVariable(value="description")String description){
        return alienR.findByDescriptionInitial(description);
    }

    @GetMapping("/majorPrice/{price}")
    public List<Alien> listByMajorPrice(@PathVariable(value="price")double price){
        return alienR.findByMajorPrice(price);
    }

    @GetMapping("/minorPrice/{price}")
    public List<Alien> listByMinorPrice(@PathVariable(value="price")double price){
        return alienR.findByMinorPrice(price);
    }

    @GetMapping("/description/{description}/type/{type}")
    public List<Alien> listByDescriptionAndType(@PathVariable(value="description")String description,@PathVariable(value="type")String type){
        return alienR.findByDescriptionAndType(description, type);
    }

    @GetMapping("/description/{description}/price/{price}")
    public List<Alien> listByDescriptionAndPrice(@PathVariable(value="description")String description,@PathVariable(value="price")double price){
        return alienR.findByDescriptionAndPrice(description, price);
    }
}
