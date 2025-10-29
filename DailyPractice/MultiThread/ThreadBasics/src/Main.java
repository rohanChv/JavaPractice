
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Task extends Thread{
public void run(){
    for (int i=0;i<1500;i++){
        System.out.print("T");
    }
}
}
public class Main {
    public static void main(String[] args) {
        Task t=new Task();
        t.start();//start Thread
        Thread t1=new Thread(()->{
            for(int i=0;i<1500;i++){
                System.out.print("R");
            }
        });
        t1.start();
        for (int i=0;i<1500;i++){
            System.out.print("M");
        }
    }
}