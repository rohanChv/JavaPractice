package com.example.EntityRev.repo;

import com.example.EntityRev.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
