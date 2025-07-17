import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Students> list=new ArrayList<>();
        list.add(new Students("Rohan",78.90,1));
        list.add(new Students("Rajesh",79.90,2));
        list.add(new Students("Ajay",18.90,3));
        list.add(new Students("Sanjay",90.00,4));
        list.add(new Students("Mohan",68.90,5));
        Comparator<Students> marksComp=Comparator.comparing(Students::getMarks).reversed();
        list.sort(marksComp);
        list.forEach(System.out::println);
    }
}