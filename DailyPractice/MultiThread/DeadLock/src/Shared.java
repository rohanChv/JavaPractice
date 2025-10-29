public class Shared {

    public synchronized void methodOne(Shared s){
        Thread t=Thread.currentThread();
        System.out.println("Current Thread accessing Method one is "+ t.getName());
        s.methodTwo(this);
        System.out.println("Completed Method One");
    }
    public synchronized void methodTwo(Shared s){
        Thread t=Thread.currentThread();
        System.out.println("Current Thread accessing Method Two is "+ t.getName());
        s.methodOne(this);
        System.out.println("Completed methodTwo");
    }
}
