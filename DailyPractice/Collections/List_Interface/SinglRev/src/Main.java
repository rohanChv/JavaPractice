//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Employee ramesh=new Employee(1,"Ramesh","Chomu");
    Employee suresh=new Employee(2,"Suresh","Taklu");
    Employee mangesh=new Employee(3,"Mangesh","Ganjedi");
    Employee srk=new Employee(4,"srk","Nashedi");
    EmployeeList list=new EmployeeList();
    list.add(ramesh);
    list.add(suresh);
    list.add(srk);
    list.add(mangesh);
    list.print();
    list.getSize();
    }
}