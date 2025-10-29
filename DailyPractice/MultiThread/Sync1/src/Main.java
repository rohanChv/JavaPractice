//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread firstThread=new Thread(new MsgClass("Hi"));
        Thread SecondThread=new Thread(new MsgClass("This"));
        Thread thirdThread=new Thread(new MsgClass("Is"));
        Thread fourthThread=new Thread(new MsgClass("Synced Call"));
        System.out.println("Starting "+firstThread.getName());
        firstThread.start();
        System.out.println("Starting "+SecondThread.getName());
        SecondThread.start();
        System.out.println("Starting "+thirdThread.getName());
        thirdThread.start();
        System.out.println("Starting "+fourthThread.getName());
        fourthThread.start();
    }
}