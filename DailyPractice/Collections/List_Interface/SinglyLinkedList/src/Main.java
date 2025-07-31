//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee ramesh=new Employee(1,"Ramesh","Sureah");
        Employee suresh=new Employee(2,"Suresh","Sureah");
        Employee ganesh=new Employee(3,"ganesh","Sureah");

        EmployeeList emp=new EmployeeList();
        emp.add(ramesh);
        emp.add(suresh);
        emp.add(ganesh);
        emp.print();

    }
}