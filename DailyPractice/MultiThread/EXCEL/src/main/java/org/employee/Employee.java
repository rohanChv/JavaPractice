package org.employee;

public class Employee {
    String name;
    String surname;
    String project;
    Double salary;

    public Employee(String name, String surname, String project, Double salary) {
        this.name = name;
        this.surname = surname;
        this.project = project;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
