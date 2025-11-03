import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        GasStation gas=new GasStation();
        ExecutorService ex= Executors.newFixedThreadPool(10);
        for(int i=0;i<1000;i++) {
            int finalI = i;
           ex.execute(()->{
                try {
                   gas.fillUpTank("Rider ".concat(Integer.toString(finalI)),(Math.random()*1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        ex.shutdown();
    }
}