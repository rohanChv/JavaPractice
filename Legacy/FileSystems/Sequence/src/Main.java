import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream first=new FileInputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\Sequence\\src\\Chaper1.txt");
        FileInputStream second=new FileInputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\Sequence\\src\\Chapter2.txt");
        FileInputStream third=new FileInputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\Sequence\\src\\Chapter4.txt");
        FileInputStream foourth=new FileInputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\Sequence\\src\\Chapter5.txt");
        FileOutputStream book=new FileOutputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\Sequence\\src\\BookAdventure.txt");
        //SequenceInputStream sin=new SequenceInputStream(new SequenceInputStream(first,second),new SequenceInputStream(third,foourth));
        Vector<InputStream> inputList=new Vector<>();
        inputList.add(first);
        inputList.add(second);
        inputList.add(third);
        inputList.add(foourth);
        Enumeration<InputStream> input=inputList.elements();
        inputList.forEach(System.out::println);
        SequenceInputStream sin=new SequenceInputStream(input);
        int data=0;
        while((data=sin.read())!=-1){
            System.out.print((char)data);
            book.write(data);
        }

    }
}