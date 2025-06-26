import java.io.Serializable;

public class SecondArray implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<100;){
            if(i%2!=0)
                System.out.println("thread two ->"+i);
            ++i;
        }
    }
}
