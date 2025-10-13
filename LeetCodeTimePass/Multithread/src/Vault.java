import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vault {
    Random rand=new Random();
    Integer password=rand.nextInt(9999);
    public  class AscendingHacker extends Thread{
        @Override
        public void run(){
            System.out.println("ascending start");
            for (Integer x=0;x<9999;x++){
                if(x.equals(password)){
                    System.out.print("Ascending hacker Says Hi");
                    System.exit(0);
                }
            }
        }
    }
    public  class DescendingHacker extends Thread{
        @Override
        public void run(){
            System.out.println("Descending start");
            for (Integer x=9999;x>=0;x--){
                if(x.equals(password)){
                    System.out.print("Descending hacker Says Hi");
                    System.exit(0);
                }
            }
        }
    }

    public static class Police extends Thread{
        @Override
        public void run(){

            for(int i=10;i>0;i--){
                System.out.println("I am there in "+i+" min");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("Not Today Pal... ");
            System.exit(0);
        }
    }

    public void startGame(){
        System.out.println(password);
        List<Thread> actors=new ArrayList<>();
        actors.add(new AscendingHacker());
        actors.add(new DescendingHacker());
        actors.add(new Police());

        for(Thread x :actors){
            x.start();
            x.setPriority(Thread.MAX_PRIORITY);
        }
    }

}
