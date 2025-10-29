import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bank b=new Bank();
        b.totalBalance();
        for(int i=0;i<10;i++){
            try {
                Thread t=new Thread(b::startTransactions);
                t.start();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        ScheduledExecutorService ex= Executors.newScheduledThreadPool(10);
        ex.schedule(()->{
            System.out.println("Chrono Check " +b.totalBalance());
            b.getAccountDetails();
        },20,TimeUnit.SECONDS);
    }
}