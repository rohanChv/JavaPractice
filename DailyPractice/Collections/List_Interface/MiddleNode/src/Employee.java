public class Employee implements Comparable {
    String name;
    String surName;
    int id;

    public Employee(String name, String surName, int id) {
        this.name = name;
        this.surName = surName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Employee emp=(Employee)o;
        return Integer.compare(this.getId(), emp.getId());
    }
}
