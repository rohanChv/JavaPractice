import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
    try{
        Date createdDate=null;
        File jsonInput=new File("C:\\Users\\rohangch\\Documents\\Support\\Daily Tasks\\2025\\July\\1\\LineItem.json");
        FileOutputStream zipOut=new FileOutputStream("Json.zip");
        ZipOutputStream zos=new ZipOutputStream(zipOut);
        ZipEntry zs=new ZipEntry("Company-info.json");
        zos.putNextEntry(zs);
        int length;
        byte[] buffer= Files.readAllBytes(Paths.get(jsonInput.getPath()));
        zos.write(buffer,0,buffer.length);
        zos.close();
        zipOut.close();

    }catch (Exception e){
        System.out.println("Exception");
    }
    }
}