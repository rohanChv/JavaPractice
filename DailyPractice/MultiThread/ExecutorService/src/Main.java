import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(10);
        for(int i=0;i<500;i++){
            ex.submit(()->{
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        ScheduledExecutorService ex1=Executors.newScheduledThreadPool(10);
        ex1.scheduleAtFixedRate(()->{
            ThreadPoolExecutor pool=(ThreadPoolExecutor)ex;
            BlockingQueue<Runnable> q= pool.getQueue();
            System.out.println("Pending Tasks"+q.size());
        },100,6000L,TimeUnit.MILLISECONDS);
    }
}