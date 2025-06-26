import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try(FileInputStream codeFile=new FileInputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\FileStreamByte\\src\\Main.java");FileOutputStream outputFile=new FileOutputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\FileStreamByte\\src\\output.txt")
        ){
            int data=0;
            while ((data=codeFile.read())!=-1){
                outputFile.write(data);
                System.out.println(codeFile.available());
            }
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}