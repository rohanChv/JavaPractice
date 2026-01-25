import java.util.HashMap;
import java.util.Map;

public class MAin {
    public static void main(String[] args) {
        String inputString="abcbcxyzwb";
        Map<Character,Integer> map=new HashMap<>();//initialize map to store the index of element
        StringBuilder sb=new StringBuilder();//new String builder
        int left=0;// add left pointer
        for (int i=0;i<inputString.length();i++){
            //parse every character in String
            char c=inputString.charAt(i);
            if(map.containsKey(c)){
                // if the element is repeated, move the left pointer to next character
               left= map.get(c)+1;
            }
            map.put(c,i);//add to map to remember possition of last seen element
            if(i>=left && (sb.length()<=(i+1-left))){
                // condition to store only the largest string
                sb=new StringBuilder(inputString.substring(left,i+1));
            }
        }
        System.out.println(sb);
    }
}
