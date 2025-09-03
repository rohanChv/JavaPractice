//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PriorityQ q=new PriorityQ();
        q.add(23);
        q.add(2);
        q.add(12);
        q.add(15);
        q.add(35);
        q.add(71);
        q.add(99);
        System.out.println(q);
        q.remove(2);
        System.out.println(q);
    }
}