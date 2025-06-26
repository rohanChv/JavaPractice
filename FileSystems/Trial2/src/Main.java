import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\rohangch\\Downloads\\Consolidated_MBR_Report_May_2025.xlsx");
        FileReader fr=new FileReader(file);
        int data=0;
        while((data=fr.read())!=-1){
            System.out.print((char)data);
        }
    }
}