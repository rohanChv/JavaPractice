import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>(Comparator.naturalOrder());
        q.add(1);
        q.add(14);
        q.add(5);
        q.add(3);
        q.add(9);
        q.add(11);
        System.out.println(q);

    }
}