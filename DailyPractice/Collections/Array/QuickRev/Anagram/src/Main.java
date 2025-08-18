import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void checkAnagram(String s1,String s2){
        char[] string1=s1.toCharArray();
        char[] string2=s2.toCharArray();
        if(string1.length!=string2.length){
            System.out.println("Not Anagram");
        }
        else {
            Arrays.sort(string1);
            Arrays.sort(string2);
            boolean result=Arrays.equals(string1,string2);
            System.out.println(result?"its Anagram":"Not Anagram");
        }
    }
    public static void main(String[] args) {
        checkAnagram("restful","fluster");
    }
}