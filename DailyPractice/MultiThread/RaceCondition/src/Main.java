//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Counter c=new Counter();
        Thread t=new Thread(c);
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);
        //Race Condition avoid with Synchronized
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}