package com.example.OMRel.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @SequenceGenerator(name="seq",sequenceName = "customer_sequence",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="customer_name")
    private String customerName;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Address> address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
