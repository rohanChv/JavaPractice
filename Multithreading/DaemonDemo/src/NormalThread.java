public class NormalThread extends Thread{
    public void run(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Activated Normal Thread");
    }
}
