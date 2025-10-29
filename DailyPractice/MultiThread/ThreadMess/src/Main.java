import java.net.MalformedURLException;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        Counter c=new Counter();
        Thread t1=new Thread(()-> {
            try {
                c.count(35);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(()-> {
            try {
                c.count(46);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        c.getNumber();
        System.out.println("Sending Request");
    }
}