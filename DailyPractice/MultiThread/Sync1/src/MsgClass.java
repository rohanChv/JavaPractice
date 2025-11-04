public class MsgClass implements Runnable{
    String s;
    MsgClass(String s){
       this.s=s;
    }

    synchronized void displayMsg(String s) throws InterruptedException {
        System.out.println(s);
        Thread.sleep(1000);
    }

    @Override
    public void run() {
        try {
            displayMsg(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
