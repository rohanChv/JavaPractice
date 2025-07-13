import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        List<Object> list=new ArrayList<>();
        for(Integer i=0;i<100000;i++){
            Person p =new Person(i,"TED".concat(i.toString()),"BUNDY".concat(i.toString()),"SERIAL KILLER".concat(i.toString()));
            list.add(p);
        }
        File inputJson=new File("PersonJson.json");
        FileOutputStream fos=new FileOutputStream(inputJson);
        for(Object p:list){
            fos.write(p.toString().getBytes(StandardCharsets.UTF_8));
        }
        FileOutputStream fosZip=new FileOutputStream("Person.zip");
        ZipEntry ze=new ZipEntry("Person-Json.json");
        ZipOutputStream zos=new ZipOutputStream(fosZip);
        zos.putNextEntry(ze);
        byte[] buff=Files.readAllBytes(Paths.get(inputJson.getPath()));
        zos.write(buff,0,buff.length);
        zos.closeEntry();
        zos.close();

    }
}