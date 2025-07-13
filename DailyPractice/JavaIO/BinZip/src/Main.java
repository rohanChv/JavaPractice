import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        File excelFile=new File("Binary.xlsb");
        OutputStream fos=new FileOutputStream("ZippedFile.zip");
        ZipOutputStream zos=new ZipOutputStream(fos);
        ZipEntry ze=new ZipEntry("Binary.xlsb");
        FileInputStream fis=new FileInputStream(excelFile);
        try{
            zos.putNextEntry(ze);
            byte[] buf=new byte[(1024^2)*50];
            int buf1;
            while((buf1=fis.read(buf))!=-1){
                zos.write(buf,0,buf.length);
            }

            zos.close();
            fos.close();
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory(); // Maximum memory the JVM can use
            long allocatedMemory = runtime.totalMemory(); // Total memory currently allocated to the JVM
            long freeMemory = runtime.freeMemory(); // Free memory within the allocated memory

            System.out.println("Max Memory: " + maxMemory / (1024 * 1024) + " MB");
            System.out.println("Allocated Memory: " + allocatedMemory / (1024 * 1024) + " MB");
            System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");
            System.out.println("Used Memory: " + (allocatedMemory - freeMemory) / (1024 * 1024) + " MB");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            zos.close();
        }

    }
}