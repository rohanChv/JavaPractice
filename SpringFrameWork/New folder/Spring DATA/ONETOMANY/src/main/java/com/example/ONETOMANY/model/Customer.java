package com.example.ONETOMANY.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Customer")
@NamedQuery(name="Customer.findByIDs",
        query = "select c from Customer c where c.id in (:id)"
)
public class Customer implements Serializable {

    //id,name,country,mobile_number

    @Id
    @SequenceGenerator(name="seq",sequenceName = "customer_sequence",allocationSize =1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="country")
    private String country;

    @Column(name="mobile_number",unique = true)
    private Integer mobileNumber;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Order> orders;

    public Customer() {
    }

    public Customer(String name, String country, Integer mobileNumber) {
        this.name = name;
        this.country = country;
        this.mobileNumber = mobileNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
