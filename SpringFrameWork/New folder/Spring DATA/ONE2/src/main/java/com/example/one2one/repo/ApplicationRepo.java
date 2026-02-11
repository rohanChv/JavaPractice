package com.example.one2one.repo;

import com.example.one2one.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends JpaRepository<Applicant,Integer> {
}
