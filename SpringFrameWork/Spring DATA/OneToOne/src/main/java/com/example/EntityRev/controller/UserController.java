package com.example.EntityRev.controller;

import com.example.EntityRev.model.IdDetails;
import com.example.EntityRev.model.User;
import com.example.EntityRev.repo.IDRepo;
import com.example.EntityRev.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    IDRepo idRepo;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/createDummyData")
    public User createDummyData(){
        IdDetails idDetails=new IdDetails();
        idDetails.setIdName("PAN CARD");
        idDetails.setIdNumber("ABC1908");
        idRepo.save(idDetails);
        User u=new User();
        u.setIdDetails(idDetails);
        u.setName("TEST USER");
        u.setName("TEST SURNAME");
        userRepo.saveAndFlush(u);
        return u;
    }

    @GetMapping("/getById/{Id}")
    public User getData(@PathVariable("Id")Integer id){
        Optional<User> u =userRepo.findById(id);
        System.out.println(u.get().getIdDetails());
        return u.get();
    }

    @PostMapping("/postBatch")
    public void postUserBatch(@RequestBody List<User> userList){

        for(User u:userList){
            idRepo.save(u.getIdDetails());
            userRepo.save(u);
        }

    }

    @GetMapping("/getId/{id}")
    public IdDetails getUserById(@PathVariable("id")Integer id){
        IdDetails myId=idRepo.findById(id).get();
        //System.out.println(myId.getUser().getName());
        return  myId;
    }

    @GetMapping("/getWords/{statement}")
    public String getWords(@PathVariable("statement")String statement){
        statement=statement.trim();
        char[] c=statement.toCharArray();
        StringBuilder sb=new StringBuilder();
        System.out.println(Arrays.toString(c));
        for(int i=0;i<c.length;i++){
            if(i==0){
                sb.append(c[i]);
                continue;
            }

            if(sb.charAt(sb.length()-1)==' '&& (c[i]==' '))
                continue;
            else
                sb.append(c[i]);
        }
        String[] array=sb.toString().split("\\s");
        sb= new StringBuilder("");
        for(int i= array.length-1;i>=0;i--){
            sb.append(array[i]+" ");
        }
        return sb.toString();

    }

}
