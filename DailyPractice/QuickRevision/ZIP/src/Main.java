import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        File sourceFile=new File("C:\\Users\\rohangch\\Documents\\Support\\Daily Tasks\\2025\\July\\1\\LineItem.json");
        FileOutputStream zipOutput=new FileOutputStream("File.zip");
        ZipEntry ze=new ZipEntry("LineItem.json");
        ZipOutputStream zip=new ZipOutputStream(zipOutput);
        zip.putNextEntry(ze);
        zip.write(Files.readAllBytes(Paths.get(sourceFile.getPath())));
        zip.close();
        zipOutput.close();
        System.out.println("File has been Written");
    }
}