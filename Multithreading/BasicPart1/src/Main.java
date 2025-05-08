public class Main {
    public static void main(String[] args) {
        Thread firstThread=new Thread(new FirstArray(),"firstThread");
        Thread secondThread=new Thread(new SecondArray(),"secondThread");
        firstThread.start();
        secondThread.start();

    }
}