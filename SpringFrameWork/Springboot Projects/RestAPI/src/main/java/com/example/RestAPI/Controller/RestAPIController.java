package com.example.RestAPI.Controller;

import com.example.RestAPI.DTO.Country;
import com.example.RestAPI.Service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestAPIController {
    @GetMapping("/welcome")
    public String getWelcome(){
        return "Nikaal L**D*";
    }
    @GetMapping("/response")
    public ResponseEntity<List<Country>> getListOfCapitals(){
        List<Country> getTheCountry=new ArrayList<>();
        getTheCountry.add(new Country("France","Paris"));
        getTheCountry.add(new Country("Japan","Tokyo"));
        return  ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("MSG","Sucess")
                .body(getTheCountry);
    }
    @PostMapping("/addCountries")
    public ResponseEntity<String> addCountry(@RequestBody List<Country> list){
        CountryService cs=new CountryService();
        String s=cs.addCountry(list);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(s);
    }
}
