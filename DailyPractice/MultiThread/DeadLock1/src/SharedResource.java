public class SharedResource {

    public synchronized void methodOne(SharedResource s){
        Thread t=Thread.currentThread();
        System.out.println("I am being invoked by ->"+t.getName());
        s.methodTwo(s);
        System.out.println("Invoked Method 2");
    }
    public synchronized void methodTwo(SharedResource s){
        Thread t=Thread.currentThread();
        System.out.println("I am being invoked by ->"+t.getName());
        s.methodOne(s);
        System.out.println("Invoked Method 1");
    }

}
