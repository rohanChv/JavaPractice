package com.example.SecurityPractice.model;

import javax.persistence.*;

@Entity
@Table(name="user_Details")
public class User {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "seq",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private Integer Id;

    @Column(name="user_name")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="roles")
    private String roles;

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
