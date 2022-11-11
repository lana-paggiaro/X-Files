package com.example.projetoX.repository;

import com.example.projetoX.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {
    public List<Customer> findByName (String name);

    public List<Customer> findByEmail (String email);

    @Query(value="select a from Customer a where a.name like %?1%")
    public List<Customer> findByNameInitial(String name);

    /*@Query(value="select a from Customer a where a.codec > ?1")
    public List<Customer> findByMajorCode (int codec);*/
}
