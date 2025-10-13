import java.io.*;
import java.nio.file.Files;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void print(String s, int a){
            try{
                Thread.sleep(a);
                System.out.println(s);
            }catch (Exception e){
                System.out.println(e);
            }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final int threadCount=10;
        Executor ex= Executors.newFixedThreadPool(threadCount);
        ex.execute(()->print("Hello",1000));
        ex.execute(()->print("Hello2",1000));
        ex.execute(()->print("Hello3",1000));
        ex.execute(()->print("Hello4",1000));
        ex.execute(()->print("Hello5",1000));
        ex.execute(()->print("Hello6",1000));
        Thread.sleep(5000);
        FileReader fr =new FileReader(new File("C:\\Users\\rohangch\\Documents\\JavaPractice\\DailyPractice\\MultiThread\\Executors\\src\\Main.java"));
        BufferedReader br=new BufferedReader(fr);
        int a=br.read();
        StringBuilder s1=new StringBuilder();
        while (a!=-1){
            s1.append((char)a);
            a=br.read();
        }
        String fileString=s1.toString();
        String[] arrayOfWords=fileString.split(" ");
        int count=0;
        for(String s:arrayOfWords){
            if(s.contains("ex.execute")){
                ++count;
            }
        }
        System.out.println(count);
    }
}