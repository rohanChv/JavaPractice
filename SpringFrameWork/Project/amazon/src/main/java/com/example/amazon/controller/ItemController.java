package com.example.amazon.controller;

import com.example.amazon.model.Item;
import com.example.amazon.repo.ItemRepository;
import com.example.amazon.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.LockModeType;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CartService cartService;

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

    @GetMapping("/getByName/{item_name}")
    public List<Item> getListByName(@PathVariable("item_name")String name){
        return itemRepository.findByItemNameLike("%"+name+"%");
    }

    @PostMapping("/addItemToCart/{quantity}")
    public ResponseEntity<String> addItemToCart(@RequestBody Item i,@PathVariable("quantity")Integer quantity){
        return cartService.addItemToCart(i,quantity);
    }

    @GetMapping("/getCart")
    public  ResponseEntity<List<Item>> getcart(){
        return cartService.getCart();
    }

    @GetMapping("/GetByID/{id}")
    public void getID(@PathVariable("id")long id) throws InterruptedException {
        cartService.updateStock(id);
    }

}
