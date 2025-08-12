import com.sun.org.apache.xml.internal.serialize.Serializer;
import com.sun.org.apache.xml.internal.serialize.TextSerializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //first Regular
        List<String> fruits=new ArrayList<>();
        fruits.add("Hello");
        //using Arrays
        List<Integer>numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        //using nCopies
        List<String>names=new ArrayList<>(Collections.nCopies(10,"Champ"));
        System.out.println(names);
        //anonymous Classes
        ArrayList<String> surname=new ArrayList(){{
           add("HEma");
           add("Rekha");
           add("Jaya");
           add("Sushma");
        }};
        System.out.println(surname);
        ArrayList<String>newSurnames=(ArrayList<String>)surname.clone();//shallow copy
        System.out.println(newSurnames);
    }
}