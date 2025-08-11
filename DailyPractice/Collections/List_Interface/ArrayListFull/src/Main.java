import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        // ArrayList uses Backing Array which is dynamically growing array.
        //default capacity 10
        Employee ramesh=new Employee(1,"Ramesh","Kelkar");
        Employee suresh=new Employee(2,"Suresh","Chavan");
        Employee ajay=new Employee(4,"Ajay","Devgan");
        Employee babita=new Employee(3,"Babita","Iyer");
        Employee champak=new Employee(5,"Champak","Gada");
        Employee jetha=new Employee(6,"Jetha","Gada");
        list.add(ramesh);
        list.add(suresh);
        list.add(ajay);
        list.add(babita);
        list.add(champak);
        list.add(jetha);

        list.set(4,champak);
        System.out.println(list.contains(ajay));
        list.forEach(System.out::println);
        list.sort((Employee employee1,Employee employee2)->employee2.getName().compareTo(employee1.getName()));
        System.out.println("Sorted List -> ");
        list.forEach(System.out::println);
        System.out.println(list.indexOf(ajay));
        ListIterator<Employee> li= list.listIterator();

        ((ArrayList<Employee>) list).trimToSize();
    }
}