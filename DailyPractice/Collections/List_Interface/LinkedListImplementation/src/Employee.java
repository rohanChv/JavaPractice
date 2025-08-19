public class Employee implements Comparable<Employee>{
    private String name;
    private String surName;
    private int age;
    private int id;

    public Employee(String name, String surName, int age, int id) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.getId(),e.getId());
    }
}
