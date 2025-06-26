import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\BufferedStreams\\src\\Main.java");
        BufferedInputStream bis=new BufferedInputStream(file);
        int data=0;
        while((data= bis.read())!=-1){
            System.out.print(data+",");
        }
    }
}