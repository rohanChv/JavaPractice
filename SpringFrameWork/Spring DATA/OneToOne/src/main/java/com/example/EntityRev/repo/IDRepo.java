package com.example.EntityRev.repo;

import com.example.EntityRev.model.IdDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface IDRepo extends JpaRepository<IdDetails, Integer> {
}
