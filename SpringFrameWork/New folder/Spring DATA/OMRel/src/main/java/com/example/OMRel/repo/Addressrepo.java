package com.example.OMRel.repo;

import com.example.OMRel.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Addressrepo extends JpaRepository<Address,Integer> {
}
