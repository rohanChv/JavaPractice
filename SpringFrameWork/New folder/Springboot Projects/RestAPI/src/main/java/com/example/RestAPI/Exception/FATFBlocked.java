package com.example.RestAPI.Exception;

public class FATFBlocked extends RuntimeException{
    @Override
    public String toString() {
        return "FATF Banned Country";
    }
}
