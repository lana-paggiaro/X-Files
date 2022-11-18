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

    /*(localhost:8080/apiCustomer/insertCustomer)*/
    @PostMapping("/insertCustomer")
    public void insertCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
    }

    /*(localhost:8080/apiCustomer/updateCustomer)*/
    @PutMapping("/updateCustomer")
    public void updateCustomer(@RequestBody Customer cust){
        customerRepository.save(cust);
    }

    /*(localhost:8080/apiCustomer/allCustomers)*/
    @GetMapping(value="/allCustomers")
    public List<Customer> searchAll (){
        return customerRepository.findAll();
    }

    /*(localhost:8080/apiCustomer/deleteCustomer)*/
    @DeleteMapping("/deleteCustomer")
    public void deleteCustomer(@RequestBody Customer cust){
        customerRepository.delete(cust);
    }

    /*(localhost:8080/apiCustomer/searchName/{name})*/
    @GetMapping("/searchName/{name}")
    public List<Customer> listByName(@PathVariable(value="name") String name){
        return customerRepository.findByName(name);
    }

    /*(localhost:8080/apiCustomer/searchEmail/)*/
    @GetMapping("/searchEmail/{email}")
    public List<Customer> listByEmail(@PathVariable(value="email") String email){
        return customerRepository.findByEmail(email);
    }

    /*(localhost:8080/apiCustomer/searchCustomer/{codec})*/
    @GetMapping ("/searchCode/{codec}")
    public Optional<Customer> searchByCode(@PathVariable(value="codec")int codec) {
        return customerRepository.findById(codec);
    }

    /*(localhost:8080/apiCustomer/initialName/{name})*/
    @GetMapping("/initialName/{name}")
    public List<Customer> listByNameInitial(@PathVariable(value="name") String name){
        return customerRepository.findByNameInitial(name); /*fé*/
    }

    /*(localhost:8080/apiCustomer/initialEmail/{email})*/
    @GetMapping("/initialEmail/{email}")
    public List<Customer> listByEmailInitial (@PathVariable(value="email") String email){
        return customerRepository.findByEmailInitial(email);
    }

    /*(localhost:8080/apiCustomer/majorCode/{codec})*/
    @GetMapping("/majorCode/{codec}")
    public List<Customer> listByMajorCode(@PathVariable(value="codec") int codec){
        return customerRepository.findByMajorCode(codec);
    }

    /*(localhost:8080/apiCustomer/name/{name}/email/{email})*/
    @GetMapping("/name/{name}/email/{email}")
    public List<Customer> listByNameAndEmail(@PathVariable(value="name")String name,@PathVariable(value="email")String email){
        return customerRepository.findByNameAndEmail(name, email);
    }
}
