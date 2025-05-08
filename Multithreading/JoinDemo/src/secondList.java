public class secondList extends Thread{
    @Override
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("Hello Thread two says ->"+i);
        }
    }
}
