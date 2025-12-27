package com.example.EntityRev.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "user_details")
public class User {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "user_seq",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="lastname")
    private String lastName;

    @OneToOne
    @JoinColumn(name="idnumber",unique = true)
    private IdDetails idDetails;



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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IdDetails getIdDetails() {
        return idDetails;
    }

    public void setIdDetails(IdDetails idDetails) {
        this.idDetails = idDetails;
    }
}
