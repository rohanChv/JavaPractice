public class Shared {

    public synchronized void methodOne(){
        Thread t=Thread.currentThread();
        System.out.println("Calling Method One "+t.getName());
        try{
            System.out.println("Waiting for Lock");
            wait();
            System.out.println(t.getName()+"+"+t.getPriority()+"Got Notification... Will go to Sleep Now");
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println("Exception "+t.getName());
        }
    }
    public synchronized void methodTwo(){
        Thread t=Thread.currentThread();
        System.out.println("Calling Method Two "+t.getName());
        try{
            System.out.println(t.getName()+" Will go to Sleep Now");
            System.out.println("Task Done Releasing Lock");
            notify();
            Thread.sleep(10000);
            System.out.println("Woke up "+t.getName());
        }catch (Exception e){
            System.out.println("Exception "+t.getName());
        }
    }
}
