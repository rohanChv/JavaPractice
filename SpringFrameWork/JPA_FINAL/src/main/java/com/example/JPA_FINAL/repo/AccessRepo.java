package com.example.JPA_FINAL.repo;

import com.example.JPA_FINAL.model.AccessCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessRepo extends JpaRepository<AccessCard,Integer> {
}
