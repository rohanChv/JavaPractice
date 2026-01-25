package com.example.SecurityPractice.repo;

import com.example.SecurityPractice.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<DBUser,Integer> {
    public DBUser findByUserName(String userName);
}
