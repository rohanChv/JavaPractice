import java.util.ArrayList;
import java.util.List;

public class MultiExecutor{
    List<Thread> list=new ArrayList<>();
    public MultiExecutor(List<Runnable> tasks){
        for(Runnable r:tasks){
            Thread t=new Thread(r);
            list.add(t);
        }
    }

    public void executeAll(){
        for(Thread t :list){
            t.start();
        }
    }
}
