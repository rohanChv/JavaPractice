public class MyCall implements Runnable{
    String name;
    MyCall(String s){
        this.name=s;
    }
    public synchronized void displayMsg(MyCall c){
        System.out.println("Caller Found");
        this.call(c);
    }
    public synchronized void call(MyCall c){
        System.out.println(c.name+"is Calling");
    }

    @Override
    public void run(){
       this.displayMsg(this);

    }
}
