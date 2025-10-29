import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Company mnc=new Company();
        Thread t=new Thread(()->{
            for(int i=0;i<1000;i++){
                Integer intVal=i;
                mnc.add(new Employee("Ravish".concat(intVal.toString()),(Math.random()*1000),i));
            }
        });
        Thread total=new Thread(()->{
            for(int i=0;i<20;i++){
                mnc.getTotalSalary();
            }
        });
        t.start();
        total.start();
        ScheduledExecutorService ex= Executors.newScheduledThreadPool(2);
        ex.schedule(mnc::getAll,30, TimeUnit.SECONDS);
    }
}