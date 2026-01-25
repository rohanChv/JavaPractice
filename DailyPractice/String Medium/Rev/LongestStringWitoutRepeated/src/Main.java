import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String inputString="abcbcdxyb";
        Map<Character , Integer> map=new HashMap<>();
        StringBuffer subString = new StringBuffer();
        int left=0;
        for(int i=0;i<inputString.length();i++){
            char c=inputString.charAt(i);
            if(map.containsKey(c)){
                if(i>=left){
                    left= map.get(c)+1;
                }
            }
            map.put(c,i);
            if(i>=left ){
                subString=new StringBuffer(inputString.substring(left,i+1));
            }
        }
        System.out.println(subString);
    }
}
