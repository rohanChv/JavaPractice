import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // initial stage i have input string
        String inputString="abcbcxyzwb";
        //logic ->parse ever character, keep record of every character. Keep left pointer to indicate start of substring
        //if character is repeated, the left pointer should be moved to next index of repeated character
        int left=0;
        int length=0;
        String s = "";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<inputString.length();i++){
            char c=inputString.charAt(i);
            if(map.containsKey(c)){
                left= map.get(c)+1;
                //Moved pointer to next index of repeated charater
            }
            map.put(c,i);
            //subString formation
            if(i>=left){
                length=i-left+1;
                 s=inputString.substring(left,i+1);
            }
        }
        System.out.println(length);
        System.out.println(s);
    }

}
