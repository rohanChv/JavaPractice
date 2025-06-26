import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Science",40);
        map.put("Maths",50);
        map.put("English",60);
        System.out.println(map);
        System.out.println(map.containsKey("Science"));
        int sum=0;
        for(int a : map.values()){
            sum+=a;
        }
        final int total=sum;
        map.computeIfAbsent("total",(k)->total);
        System.out.println(map.entrySet());
        map.entrySet().forEach((element)->{
            System.out.println("Key is = "+element.getKey()+" Value is = "+element.getValue());
        });
        System.out.println(map.values());
        List<String> list=new ArrayList<>();
        System.out.println(map);
    }
}
