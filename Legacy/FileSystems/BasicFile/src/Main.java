import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File firstFile=new File("C:\\Users\\rohangch\\Documents\\JavaPractice\\Collection\\ArrayList");
        System.out.println("Is it a Directory "+firstFile.isDirectory());
        String[] list=firstFile.list();
        for(String element: list){
            File element1=new File(firstFile,element);
            System.out.println(element+(element1.isFile()?" is a File":element1.isDirectory()?" Is a directory ":"Nothing"));
        }
    }
}