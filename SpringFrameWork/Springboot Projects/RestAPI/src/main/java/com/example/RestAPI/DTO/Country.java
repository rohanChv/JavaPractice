package com.example.RestAPI.DTO;

public class Country {
    String name;

    public String getName() {
        return name;
    }

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    String capital;
}
