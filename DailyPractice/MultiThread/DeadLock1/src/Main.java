import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SharedResource s1=new SharedResource();
        SharedResource s2=new SharedResource();
        System.out.println("Starting Call");
        Thread t1=new Thread(()->s1.methodOne(s2));
        Thread t2=new Thread(()->s2.methodTwo(s1));
        t1.start();
        t2.start();
        ThreadMXBean mx= ManagementFactory.getThreadMXBean();
        long[] id=mx.findMonitorDeadlockedThreads();
        if(id!=null){
            System.out.println("Caught Dead Lock");
        }
    }
}