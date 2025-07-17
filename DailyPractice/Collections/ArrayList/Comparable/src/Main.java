import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(5,"Champak","Manager"));
        list.add(new Employee(2,"Jetha","Owner"));
        list.add(new Employee(1,"Tarak","writer"));
        list.forEach(System.out::println);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}