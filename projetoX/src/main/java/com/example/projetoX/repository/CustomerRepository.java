package com.example.projetoX.repository;

import com.example.projetoX.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {
    public List<Customer> findByName (String name);

    public List<Customer> findByEmail (String email);

    @Query("SELECT c FROM Customer c WHERE LOWER(c.name) LIKE ?1%")
    public List<Customer> findByNameInitial(String name);

    @Query("SELECT c FROM Customer c WHERE LOWER(c.email) LIKE ?1%")
    public List<Customer> findByEmailInitial(String email);

    @Query(value="SELECT c FROM Customer c WHERE c.codec > ?1")
    public List<Customer> findByMajorCode (int codec);

    @Query("SELECT c FROM Customer c WHERE LOWER(c.name) LIKE ?1% AND LOWER(c.email) LIKE ?2%")
    public List<Customer> findByNameAndEmail(String name, String email);
}
