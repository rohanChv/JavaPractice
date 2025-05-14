public class Main {
    public static void main(String[] args) {
        Thread daemonThread=new HelperThread();
        Thread userThread=new NormalThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        userThread.start();
    }
}