import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex= Executors.newFixedThreadPool(10);
        Future<String> s=ex.submit(()->{
            System.out.println("This is callable task");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Task Done";
        });
        System.out.println(s.get());
        ex.shutdown();
    }
}