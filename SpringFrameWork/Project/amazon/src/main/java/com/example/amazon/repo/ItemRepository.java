package com.example.amazon.repo;

import com.example.amazon.model.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Long> {
    public List<Item> findByItemCategory(String category, Pageable page);
}
