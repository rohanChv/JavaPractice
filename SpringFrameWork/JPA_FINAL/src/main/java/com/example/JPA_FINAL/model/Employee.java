package com.example.JPA_FINAL.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @SequenceGenerator(name = "seq",sequenceName = "emp_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    private Integer Id;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_location")
    private String employeeLocation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "access_id")
    @JsonManagedReference
    private AccessCard accessCard;
}
