import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input="abcabcbbxyzw";
        int maxLength=0;
        int left=0;
        Map<Character,Integer> charMap=new HashMap<>();
        for(int right=0;right< input.length();right++){
            char currentCharacter=input.charAt(right);
            if(charMap.containsKey(currentCharacter)){
                int prev=charMap.get(currentCharacter);
                if(prev>=left){
                    left=prev+1;
                }

            }
            maxLength=Math.max(maxLength,(right-left+1));
            System.out.println(input.substring(left,right+1));
            charMap.put(currentCharacter,right);
        }
        System.out.println(maxLength);
    }
}
