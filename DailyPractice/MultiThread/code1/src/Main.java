//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            long time=System.currentTimeMillis();
            Thread thread1=new Thread(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello");
            });
            Thread thread2=new Thread(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("There");
            });
            Thread thread3=new Thread(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Bye");
            });
            time=(System.currentTimeMillis()-time)/1000;
            thread1.start();
            thread2.start();
            thread3.start();
            System.out.println("Time ->"+time);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}