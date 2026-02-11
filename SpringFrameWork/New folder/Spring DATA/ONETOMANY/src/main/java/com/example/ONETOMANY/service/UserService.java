package com.example.ONETOMANY.service;

import com.example.ONETOMANY.model.Customer;
import com.example.ONETOMANY.model.Item;
import com.example.ONETOMANY.repo.CustomerRepo;
import com.example.ONETOMANY.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@SessionScope
public class UserService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    OrderRepo orderRepo;

    private Customer customer;
    private boolean loggedIn=false;

    private List<Item> cart=new ArrayList<>();

    public void addItemToCart(Item item){
        if(loggedIn){
            item.setCustomerId(customer.getId());
            cart.add(item);
        }
        else {
            System.out.println("PLEASE LOGIN");
        }
    }

    public Customer userLogin(Integer id){
        Optional<Customer>customerValue =customerRepo.findById(id);
        loggedIn = customerValue.isPresent();
        return customerValue.get();
    }

    public List<Item> getCart(){
        return this.cart;
    }

}
