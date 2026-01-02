package com.example.amazon.controller;

import com.example.amazon.model.Item;
import com.example.amazon.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @PostMapping("/addItems")
    public void addItemsToDB(@RequestBody List<Item> items){
        itemRepository.saveAll(items);
    }

    @GetMapping("/getListByCategory/{pageNo}/{size}/{category}")
    public List<Item> getListByCategory(@PathVariable("pageNo")Integer pageNo,@PathVariable("size")Integer size,@PathVariable("category")String category){
        Sort sort=Sort.by(Sort.Direction.DESC,"id");
        Pageable page= PageRequest.of(pageNo,size, sort);
        return itemRepository.findByItemCategory(category,page);
    }

}
