package com.example.RestAPI.Service;

import com.example.RestAPI.DTO.Country;
import com.example.RestAPI.Exception.FATFBlocked;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CountryService {
    public String addCountry(List<Country> list){
        Set<String> country=list.stream().map(Country::getName).collect(Collectors.toSet());
        if(country.contains("Pakistan")){
            throw new FATFBlocked();
        }
        StringBuffer s=new StringBuffer("Successfully added Countries ");
        country.forEach(e-> s.append(e).append(","));
        return s.toString();
    }
}
