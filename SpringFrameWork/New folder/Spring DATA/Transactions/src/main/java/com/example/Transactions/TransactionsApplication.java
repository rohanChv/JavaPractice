package com.example.Transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Objects;

@SpringBootApplication
public class TransactionsApplication {

	public static void main(String[] args) {

		SpringApplication.run(TransactionsApplication.class, args);
		String  A=" Hello  World ";
		A=A.trim();
		String[] s=A.split("\\s");
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++){
			if(s[i].contains(" ")){
				System.out.println(i);
			}
		}
		StringBuffer sb;

	}

}
