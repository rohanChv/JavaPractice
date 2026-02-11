package com.example.ONETOMANY.controller;

import com.example.ONETOMANY.DTO.CustomerDTO;
import com.example.ONETOMANY.model.Customer;
import com.example.ONETOMANY.model.Item;
import com.example.ONETOMANY.model.Order;
import com.example.ONETOMANY.repo.CustomerRepo;
import com.example.ONETOMANY.repo.OrderRepo;
import com.example.ONETOMANY.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.ObjectInputStream;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    @Transactional
    public ResponseEntity<String> createNewUser(@RequestBody String customer) throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        Customer newCustomer=objectMapper.readValue(customer,Customer.class);
        customerRepo.save(newCustomer);
        return ResponseEntity.status(200).body("SUCCESSFUL");
    }

    @PostMapping("/createByList")
    @Transactional
    public void createNewUser(@RequestBody List<Customer> customerList) throws JsonProcessingException {
        customerRepo.saveAll(customerList);
    }

    @PostMapping("/placeOrder")
    public void addPlaceOrder(@RequestBody Order order) {
        Timestamp currentTime=new Timestamp(System.currentTimeMillis());
        order.setOrderDate(currentTime);
        orderRepo.save(order);
    }

    @PostMapping("/createOrder/{customerId}")
    public void createOrder(@PathVariable("customerId") Integer id,@RequestBody Order order) {
        Customer c=userService.userLogin(id);
        if(c!=null){
            order.setCustomer(c);
        }
        orderRepo.save(order);
    }

    @PostMapping("/addItemToCart/{customerId}")
    public void addItemToCart(@PathVariable("customerId") Integer id,@RequestBody Item item) {
        Customer c=userService.userLogin(id);
        if(c!=null){
            userService.addItemToCart(item);
        }
    }

    @GetMapping("/getCart")
    public List<Item> getCart() {
        return userService.getCart();
    }

    @GetMapping("/getPersonAndOrder/{id}")
    public Customer getDetailedProfile(@PathVariable("id")Integer id){
        Customer c= customerRepo.findById(id).get();
        System.out.println(c.getOrders());
        return c;
    }
    @DeleteMapping("/removePerson/{id}")
    public void deleteUser(@PathVariable("id")Integer Id){
        customerRepo.deleteById(Id);
    }
    @PostMapping("/getPersonByIDList/")
    public Set<Customer> getDetailedProfile(@RequestBody Set<Integer> id){
        return customerRepo.findProfileById(id);
    }

    @GetMapping("getList/{pageNumber}/{totalRows}")
    public List<Customer>getCustomerList(@PathVariable("pageNumber")Integer pageNumber,@PathVariable("totalRows") Integer totalRows){
        Pageable page= PageRequest.of(pageNumber,totalRows, Sort.Direction.DESC,"id");
        return customerRepo.findAll(page).getContent();
        Sort sort=Sort.sort(Sort.ASC);
    }
}
