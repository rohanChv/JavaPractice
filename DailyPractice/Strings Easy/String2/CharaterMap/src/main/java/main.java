import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        String s1="aabbc";
        char[] arr=s1.toCharArray();
        Map<Character,Integer>map=new HashMap<>();
        for(char c:arr){
            if(map.containsKey(c)){
                int a=map.getOrDefault(c,0);
                ++a;
                map.put(c,a);
            }
            else
                map.put(c,1);
        }
        System.out.println(map.toString());
    }
}
