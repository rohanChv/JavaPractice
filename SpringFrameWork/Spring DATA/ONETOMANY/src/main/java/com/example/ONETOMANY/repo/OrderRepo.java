package com.example.ONETOMANY.repo;

import com.example.ONETOMANY.model.Customer;
import com.example.ONETOMANY.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
