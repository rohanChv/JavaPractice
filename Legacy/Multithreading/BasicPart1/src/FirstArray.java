public class FirstArray implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<50;){
            if(i%2==0)
            System.out.println("thread one ->"+i);
            ++i;
        }
    }
}
