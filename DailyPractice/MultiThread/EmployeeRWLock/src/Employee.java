import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {

    String name;
    Double Salary;
    int id;

    public Employee(String name, Double salary, int id) {
        this.name = name;
        BigDecimal b=new BigDecimal(salary);
        b=b.setScale(2, RoundingMode.UP);
        Salary =b.doubleValue();
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
