package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Cacheable
public class Product {
    @Id
    @SequenceGenerator(name = "seq",sequenceName = "prd_seq")
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "product_id")
    private Integer productId;
    @Column(name="product_name")
    private String productName;
    @Column(name="price")
    private Double price;
    @Column(name="group_id")
    private Integer groupId;

}
