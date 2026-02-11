package com.example.BasicAuthFlow.repo;

import com.example.BasicAuthFlow.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<DBUser,Integer> {
    public DBUser findByUserName(String UserName);
}
