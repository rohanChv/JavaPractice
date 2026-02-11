package com.example.OMRel.AddressController;


import com.example.OMRel.model.Address;
import com.example.OMRel.model.Customer;
import com.example.OMRel.repo.Addressrepo;
import com.example.OMRel.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    Addressrepo addressrepo;

    @Autowired
    CustomerRepo customerRepo;


    @GetMapping("/getObject")
    public Customer getAddress(){
        return new Customer();
    }

    @PostMapping("/addCustomer")
    public void getAddress(@RequestBody Customer customer){
        for(Address a: customer.getAddress()){
            a.setCustomer(customer);
        }
        customerRepo.save(customer);
    }

}
