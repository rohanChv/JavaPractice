import java.util.Collections;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> s=new PriorityQueue<>(Collections.reverseOrder());
        s.add(23);
        s.add(23);
        s.add(2);
        s.add(12);
        s.add(15);
        s.add(71);
        s.add(35);
        s.add(99);
        System.out.println(s);
        s.remove(2);
        System.out.println(s);
    }
}