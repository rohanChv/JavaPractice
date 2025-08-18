import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Hello");
        map.put(1,"Hi");
        for(Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}