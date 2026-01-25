package com.example.SecurityPractice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="db_user")
public class DBUser {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "user_seq",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private Integer Id;

    @Column(name="user_name")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="role")
    private String roles;

}
