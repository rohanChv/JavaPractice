import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pear");
        System.out.println(fruits);
        List<Integer> numbersList=new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        System.out.println(numbersList);
        fruits.add(1,"Mango");
        System.out.println(fruits);
        System.out.println(fruits.get(1));
        fruits.remove(1);
        System.out.println(fruits);
    }
}