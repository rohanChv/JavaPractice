import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list=new ArrayList<>(Arrays.asList(
                new Student(1,"Champak","Gada",60),
                new Student(2,"Jetha","Gada",44),
                new Student(3,"Tapu","Gada",15),
                new Student(4,"Daya","Gada",35)
        ));
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Student>newList=(ArrayList<Student>)list.clone();
        Collections.sort(newList,(Student s1,Student s2)->s2.getName().compareTo(s1.getName()));
        System.out.println(newList);

        File objectHolder=new File("Objects.txt");
        RandomAccessFile rand=new RandomAccessFile(objectHolder,"rw");
        for (Student s:list){
            rand.seek(rand.length());
            rand.writeBytes("\n"+new Date());
            rand.writeBytes(s.toString());
        }
        int a=0;
        rand.seek(0);
        while ( (a=rand.read())!=-1){
            System.out.print((char)a);
        }
    }
}