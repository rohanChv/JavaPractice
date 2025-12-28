package com.example.one2one.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "employee_seq")
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name="employee_id")
    private Integer employeeId;


    @Column(name="employee_name")
    private String employeeName;

    @Column(name="employee_grade")
    private String employeeGrade;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinColumn(name="department_id")
    private Department department;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
