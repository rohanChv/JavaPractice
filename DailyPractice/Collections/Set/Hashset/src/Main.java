import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<String> city=new HashSet<>();
        city.add("Mumbai");
        city.add("Beijing");
        city.add("Mumbai");
        city.add("Bangkok");
        city.add("Colombo");
        city.forEach(System.out::println);
        Iterator<String> it= city.iterator();
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("Beijing")){
                it.remove();
            }
        }
        System.out.println(city.contains("Mumbai"));
        System.out.println(city);
    }
}