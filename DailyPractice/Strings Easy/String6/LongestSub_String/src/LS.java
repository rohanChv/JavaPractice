import java.util.*;

public class LS {
    public static void main(String[] args) {
        String s="abcabcbb";
        List<String> subs=new ArrayList<>();
        List<Character> charList=new ArrayList<>();
        int counter=0;
        boolean duplicateCheck=false;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String newString=s.substring(i,j);
                for(char c:newString.toCharArray()){
                    if(!duplicateCheck){
                        if(charList.contains(c)){
                            duplicateCheck=true;
                        }
                        else
                            charList.add(c);
                    }
                }
                if(!duplicateCheck){
                    subs.add(newString);
                }
                duplicateCheck=false;
                charList.clear();
            }
        }
        subs.sort((a,b)->b.length()-a.length());
        System.out.println(subs.get(0).length());
    }
}
