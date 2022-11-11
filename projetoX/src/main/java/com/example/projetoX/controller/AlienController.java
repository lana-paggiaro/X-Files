package com.example.projetoX.controller;

import com.example.projetoX.model.Alien;
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

    @GetMapping ("/alien/{code}")
    public Optional<Alien> searchByCode(@PathVariable(value="code")int code) {
        return alienR.findById(code);
    }
}
