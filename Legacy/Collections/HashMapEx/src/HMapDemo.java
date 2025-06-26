import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> alphabetsMap=new HashMap<>();
        alphabetsMap.put(1,"A");
        alphabetsMap.put(2,"B");
        alphabetsMap.put(3,"C");
        alphabetsMap.put(4,"D");
        alphabetsMap.put(5,"E");
        alphabetsMap.put(6,"F");
        Set<Map.Entry<Integer,String>> entry=alphabetsMap.entrySet();
        for(Map.Entry e:entry){
            System.out.println(e.getKey() +" : "+e.getValue());
        }
    }
}
