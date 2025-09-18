import java.io.FilterOutputStream;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Hello");
        map.put(2,"There");
        map.put(3,"No there");
        map.put(4,"Hi");
        System.out.println(map);
        //compute if Absent it will compute value if the Value is not there
        System.out.println(map.computeIfAbsent(5,(k)->"Hello5"));
        //compute if present
        System.out.println(map.computeIfPresent(6,(k,v)->"No There Modified"));
        System.out.println(map);
        System.out.println(map.putIfAbsent(5,"There"));
        map.remove(5);
        System.out.println(map);
        map.forEach((k,v)->map.put(k,v.concat("Mod")));
        System.out.println(map);
        ArrayList<String> list=new ArrayList<>(map.values());
        System.out.println(list);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}