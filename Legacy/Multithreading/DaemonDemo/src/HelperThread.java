public class HelperThread extends Thread{
    public void run(){
        try {
            int count=0;

            while (count<500){
                Thread.sleep(100);
                System.out.println("Demon Thread is Running");
                ++count;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
