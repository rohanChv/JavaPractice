public class firstList extends Thread{
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Hello Thread one says ->"+i);
        }
    }
}
