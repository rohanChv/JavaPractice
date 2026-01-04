import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       String input="abcabcbbxynert";
       Map<Character,Integer>map=new HashMap<>();
       int left=0;
       int length=0;
       StringBuilder longestString=new StringBuilder();
       for(int right=0;right< input.length();right++){
           char c=input.charAt(right);
           if(map.containsKey(c)){
               left=right;
           }
           map.put(c,right);
           if(right>=left){
               length=Math.max(length,(right-length+1));
               if(longestString.length()<=input.substring(left,right+1).length()){
                   longestString=new StringBuilder(input.substring(left,right+1));
               }
           }
       }
        System.out.println(longestString);
        System.out.println(length);
    }
}
