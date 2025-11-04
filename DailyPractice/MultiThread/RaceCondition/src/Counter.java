public class Counter implements Runnable{
    int counter=0;
    void increment(){
        ++counter;
    }
    @Override
    public void run(){
        synchronized(this){
            increment();
            ++counter;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            --counter;
            System.out.println("Value is "+counter);
        }
    }
}
