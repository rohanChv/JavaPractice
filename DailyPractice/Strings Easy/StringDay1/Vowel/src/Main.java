import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Character> vowels= Arrays.asList('a','e','i','o','u');
        String s="Hello World";
        int vowel=0;
        int conso=0;
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                if (vowels.contains(s.charAt(i))){
                    ++vowel;
                }
                else
                    ++conso;
            }
        }
        System.out.println("VOWELS "+vowel);
        System.out.println("CONSONANTS "+conso);
    }
}
