import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        try{
            System.out.println("Start Input");
            InputStream inputData= System.in;
            int data= inputData.read();
            String dataString="";
            while (data!=-1){
                char c=(char)data;
                if (Character.toString(c).equalsIgnoreCase("*")) {
                    break;
                }
                dataString=dataString.concat(Character.toString(c));
                data= inputData.read();
            }
            System.out.println(dataString);
            File file=new File("File.txt");
            if(!file.isFile()){
                file.createNewFile();
            }
            InputStream fileReader=new FileInputStream(file);
            File backupJava=new File("C:\\Users\\rohangch\\Documents\\JavaPractice\\DailyPractice\\JavaIO\\InputStream\\src\\Backup.txt");
            OutputStream backupWriter=new FileOutputStream(backupJava);
            boolean readData=true;
            while(readData){
                int a=fileReader.read();
                System.out.println("Writing");
                backupWriter.write(a);
                if (a==-1)
                    readData=false;
            }
            if(backupJava.isFile() && backupJava.exists()){
                fileReader.close();
                backupWriter.close();
                Path pathToDelete= Paths.get(backupJava.getPath());
                Files.delete(pathToDelete);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}