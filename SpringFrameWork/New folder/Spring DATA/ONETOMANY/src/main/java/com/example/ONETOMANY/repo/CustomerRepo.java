package com.example.ONETOMANY.repo;

import com.example.ONETOMANY.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    @Query(value = "select c from Customer c JOIN FETCH c.orders")
    Set<Customer>findProfileById(@Param("id") Set<Integer>Id);
}
