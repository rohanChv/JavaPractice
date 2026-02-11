package com.example.amazon.service;

import com.example.amazon.model.Item;
import com.example.amazon.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.persistence.LockModeType;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class CartService {
    List<Item> itemList=new ArrayList<>();

    @Autowired
    ItemRepository itemRepository;

    @Transactional
    public ResponseEntity<String> addItemToCart(Item i,Integer Quantity){
        int itemStock=itemRepository.findStockByItemId(i.getId());
        if(itemStock==0){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("item Sold Out PLease Try later... Sorry");
        }
        itemList.add(i);
        return ResponseEntity.status(HttpStatus.OK).body("Added to cart");
    }
    public ResponseEntity<List<Item>> getCart(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(itemList);
    }

    @Transactional
    public ResponseEntity<Long> updateStock(Long id) throws InterruptedException {
        itemRepository.findById(id);
        System.out.println("SLEEPING");
        Thread.sleep(30000);
        itemRepository.updateStockByID(300,id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(id);
    }
}
