package com.example.projetoX.controller;

import com.example.projetoX.model.Alien;
import com.example.projetoX.model.Customer;
import com.example.projetoX.repository.CustomerRepository;
import org.apache.catalina.util.CustomObjectInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/apiCustomer")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/insertCustomer")
    public void insertCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
    }

    public void updateCustomer(@RequestBody Customer cust){
        customerRepository.save(cust);
    }

    @GetMapping(value="/allCustomers")
    public List<Customer> searchAll (){
        return customerRepository.findAll();
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer cust){
        customerRepository.delete(cust);
    }

    @GetMapping("/name/{name}")
    public List<Customer> listByName(@PathVariable(value="name") String name){
        return customerRepository.findByName(name);
    }

    @GetMapping("/email/{email}")
    public List<Customer> listByEmail(@PathVariable(value="email") String email){
        return customerRepository.findByEmail(email);
    }

    @GetMapping ("/customer/{codec}")
    public Optional<Customer> searchByCode(@PathVariable(value="codec")int codec) {
        return customerRepository.findById(codec);
    }

    @GetMapping("/nameinitial/[{name}")
    public List<Customer> listByNameInitial(@PathVariable(value="name") String name){
        return customerRepository.findByNameInitial(name); /*dando bosta*/
    }

    /*@GetMapping("/customercode/{codec}")
    public List<Customer> listByMajorCode(@PathVariable(value="codec") int codec){
        return customerRepository.findByMajorCode(codec);
    }*/
}
