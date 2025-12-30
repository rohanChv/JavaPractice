import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s="The quick brown fox jumps overU the lazy dog";
        char[] array=s.toLowerCase().toCharArray();
        List<Character> letters=new ArrayList<>();
        for(char c:array){
            if(Character.isLetter(c)&& !letters.contains(c)){
                letters.add(c);
            }
        }
        System.out.println(letters);
        System.out.println((letters.size()<=26)+" "+s.startsWith("The"));
        String s2="DEV.java";
        System.out.println(s2.endsWith(".java"));
    }
}
