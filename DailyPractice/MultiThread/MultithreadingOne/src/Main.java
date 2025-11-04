import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        long currentTime=System.currentTimeMillis();
        File inputFile=new File("Input_File.txt");
        FileOutputStream fos=new FileOutputStream(inputFile);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fos));
        for(int i=0;i<100000;i++){
            bw.write("I am writing a Huge File.Lage Mafias");
        }
        FileInputStream fis=new FileInputStream(inputFile);
        ExecutorService service= Executors.newFixedThreadPool(10);
        service.execute(()->{
            for(int i=0;i<100;i++){
                try {
                    FileCreator.createFile("File"+i);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        System.out.println((System.currentTimeMillis()-currentTime)/1000);
    }
}