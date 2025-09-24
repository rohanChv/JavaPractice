import com.sun.javafx.scene.control.behavior.OptionalBoolean;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee ramesh=new Employee(1,"Ramesh","Pune",43000.00,"Male");
        Employee suresh=new Employee(2,"Suresh","Pune",43000.00,"Male");
        Employee babita=new Employee(3,"Babita","Pune",45000.00,"Female");
        Employee tarak=new Employee(4,"Tarak","Mumbai",53000.00,"Male");
        Employee anjali=new Employee(5,"Anjali","Ahemdabad",59000.00,"Female");
        Employee bapuji=new Employee(6,"Bapuji","Bhachav",69000.00,"Male");
        Employee Sodhi=new Employee(7,"Sodhi","Jalandhar",89000.00,"Male");
        Employee Daya=new Employee(8,"Daya","Ahemdabad",99000.00,"Female");

        ArrayList<Employee> list=new ArrayList<>();
        list.add(ramesh);
        list.add(suresh);
        list.add(babita);
        list.add(tarak);
        list.add(anjali);
        list.add(bapuji);
        list.add(Sodhi);
        list.add(Daya);

        Map<String, List<Employee>> locationMap=list.stream().collect(Collectors.groupingBy(Employee::getLocation,Collectors.toCollection(LinkedList::new)));
        for (Map.Entry<String,List<Employee>> entry:locationMap.entrySet()){
            System.out.println("Employees in "+entry.getKey());
            for (Employee x: entry.getValue()){
                System.out.println(x);
            }
            System.out.println("Total Female Employees : "+entry.getValue().stream().collect(Collectors.partitioningBy(employee -> employee.getGender().equalsIgnoreCase("Female"))).get(true).stream().count());

            System.out.println("---X---X---X---X---X---X---");
        }
        Boolean cond=list.stream().allMatch(e-> e.getLocation().equalsIgnoreCase("Pune"));
        System.out.println(cond);
        List<Integer> intL=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Map<Boolean,List<Integer>> fMap=intL.stream().collect(Collectors.partitioningBy(e->e%2==0,Collectors.toCollection(LinkedList::new)));
        System.out.println(fMap);
    }
}