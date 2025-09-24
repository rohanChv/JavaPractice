import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    private transient int Id;
    String surname;
    String location;
    Double salary;

    public String getName() {
        return name;
    }

    public Employee() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, String surname, String location, Double salary) {
        this.name = name;
        Id = id;
        this.surname = surname;
        this.location = location;
        this.salary = salary;
    }
}
