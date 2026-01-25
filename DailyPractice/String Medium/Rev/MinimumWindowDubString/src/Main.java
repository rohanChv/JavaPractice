import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String inputString="ADOBECODEBANC";
        String t="ABC";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c,0));
        }
        StringBuilder sb=new StringBuilder();
        int matchFound=0;
        int start=0;
        int end=0;
        for(int i=0;i<inputString.length();i++){
            char c=inputString.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
                ++matchFound;
            }
            if(matchFound>=t.length()){
                end=i+1;
                sb=new StringBuilder(inputString.substring(start,end));
            }
        }
    }
}
