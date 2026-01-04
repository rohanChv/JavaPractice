package com.example.Locking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="user_access")
public class User {

    @Id
    @
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="access")
    private String access;

    @Version
    private Long version;

}
