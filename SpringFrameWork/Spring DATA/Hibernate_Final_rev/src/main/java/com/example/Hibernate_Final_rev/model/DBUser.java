package com.example.Hibernate_Final_rev.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="db_user")
public class DBUser {
    @Id
    @SequenceGenerator(name="seq",sequenceName = "u_seq",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name")
    private String name;
}
