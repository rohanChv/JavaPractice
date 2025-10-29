public class Counter {
    private volatile int number=0;
    public void count(int a) throws InterruptedException {
        Thread t=Thread.currentThread();
            System.out.println("Lock Acquired by "+t.getName());
            System.out.println(number+"<=>"+a);
            for (int i=0;i<a;i++){
                ++number;
                Thread.sleep(10);
            }
            System.out.println(t.getName() +" Number set to "+number);
    }
    public void getNumber(){
        System.out.println("Number is " +number);
    }
}
