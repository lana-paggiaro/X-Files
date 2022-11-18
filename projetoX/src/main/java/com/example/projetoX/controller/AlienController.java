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

    /*(localhost:8080/apiAlien/insertAlien)*/
    @PostMapping ("/insertAlien")
    public void insertAlien(@RequestBody Alien alien){
        alienR.save(alien);
    }

    /*(localhost:8080/apiAlien/updateAlien)*/
    @PutMapping("/updateAlien")
    public void updateAlien(@RequestBody Alien alien){
        alienR.save(alien);
    }

    /*(localhost:8080/apiAlien/deleteAlien)*/
    @DeleteMapping("/deleteAlien")
    public void deleteAlien(@RequestBody Alien alien){
        alienR.delete(alien);
    }

    /*(localhost:8080/apiAlien/allAliens)*/
    @GetMapping(value="/allAliens")
    public List<Alien> searchAll (){
        return alienR.findAll();
    }

    /*(localhost:8080/apiAlien/searchCode/{code})*/
    @GetMapping ("/searchCode/{code}")
    public Optional<Alien> searchByCode(@PathVariable(value="code")int code) {
        return alienR.findById(code);
    }

    /*(localhost:8080/apiAlien/searchType/{type})*/
    @GetMapping("/searchType/{type}")
    public List<Alien> listByType(@PathVariable(value="type") String type){
        return alienR.findByType(type);
    }

    /*(localhost:8080/apiAlien/searchDescription/{description})*/
    @GetMapping("/searchDescription/{description}")
    public List<Alien> listByDescription (@PathVariable(value="description") String description){
        return alienR.findByDescription(description);
    }

    /*(localhost:8080/apiAlien/searchPrice/{price})*/
    @GetMapping("/searchPrice/{price}")
    public List<Alien> listByPrice (@PathVariable(value="price") double price){
        return alienR.findByPrice(price);
    }

    /*(localhost:8080/apiAlien/initialType/{type})*/
    @GetMapping("/initialType/{type}")
    public List<Alien> listByTypeInitial (@PathVariable(value="type") String type){
        return alienR.findByTypeInitial(type);
    }

    /*(localhost:8080/apiAlien/initialDescription/{description})*/
    @GetMapping("/initialDescription/{description}")
    public List<Alien> listByDescriptionInitial(@PathVariable(value="description")String description){
        return alienR.findByDescriptionInitial(description);
    }

    /*(localhost:8080/apiAlien/majorPrice/{price})*/
    @GetMapping("/majorPrice/{price}")
    public List<Alien> listByMajorPrice(@PathVariable(value="price")double price){
        return alienR.findByMajorPrice(price);
    }

    /*(localhost:8080/apiAlien/minorPrice/{price})*/
    @GetMapping("/minorPrice/{price}")
    public List<Alien> listByMinorPrice(@PathVariable(value="price")double price){
        return alienR.findByMinorPrice(price);
    }

    /*(localhost:8080/apiAlien/description/{description}/type/{type})*/
    @GetMapping("/description/{description}/type/{type}")
    public List<Alien> listByDescriptionAndType(@PathVariable(value="description")String description,@PathVariable(value="type")String type){
        return alienR.findByDescriptionAndType(description, type);
    }

    /*(localhost:8080/apiAlien/description/{description}/price/{price})*/
    @GetMapping("/description/{description}/price/{price}")
    public List<Alien> listByDescriptionAndPrice(@PathVariable(value="description")String description,@PathVariable(value="price")double price){
        return alienR.findByDescriptionAndPrice(description, price);
    }
}
