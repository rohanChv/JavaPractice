//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shared s=new Shared();
        Thread t1=new Thread(()->s.methodOne());
        Thread t2=new Thread(()->s.methodTwo());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t2.start();
    }
}