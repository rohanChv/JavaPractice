import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static  void main(String[] args) {
        List<Employee> emp= Arrays.asList(new Employee("Goggle","Associate","Pune"),
                new Employee("Capgemini","A4","Pune"),
                new Employee("Capgemini","A5","Pune"),
                new Employee("Capgemini","B1","Mumbai"),
                new Employee("Infosys","Tech","Pune"));

        Map<String, Map<String,List<Employee>>> map=new HashMap<>();

        map=emp.stream().collect(Collectors.groupingBy(Employee::getCompany,Collectors.groupingBy(
                (Employee::getLocation),Collectors.toList())
        ));
        for(Map.Entry<String,Map<String, List<Employee>>> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
