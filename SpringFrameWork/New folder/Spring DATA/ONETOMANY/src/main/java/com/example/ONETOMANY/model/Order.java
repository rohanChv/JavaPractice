package com.example.ONETOMANY.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "order_sequence",allocationSize = 1)
    @GeneratedValue(generator="seq",strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="order_date")
    private Timestamp orderDate;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonBackReference
    private Customer customer;

    

    public Order(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
