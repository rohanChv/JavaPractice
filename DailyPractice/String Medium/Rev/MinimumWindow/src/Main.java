import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String inputString ="ADOBECODEBANC";//add input string
        String target="ABC";//add target
        //create target Map to memorize the occurences of characters
        Map<Character,Integer> targetMap=new HashMap<>();
        for(char c:target.toCharArray()){
            targetMap.put(c,targetMap.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> windowMap=new HashMap<>();
        int minLen=Integer.MAX_VALUE;// There will be one condition to add in string if substring is less than min value
        int left=0;
        int right=0;
        int found=0;
        int required=targetMap.size();


    }

}
