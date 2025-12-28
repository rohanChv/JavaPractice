package com.example.one2one.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="department")
public class Department {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "dept_seq")
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name="department_id")
    private Integer departmentId;

    @Column(name="department_name")
    private String departmentName;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Employee> employeeList;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
