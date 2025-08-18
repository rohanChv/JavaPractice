//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void checkPalindrome(String s){
        char[] array=s.toCharArray();
        int i=0;
        int counter=0;
        int j= array.length-1;
        while (j!=0){
            if(array[i]==array[j]){
                ++counter;
            }
            ++i;
            --j;
        }
        System.out.println(s+" is "+((counter== array.length-1)?"Palindrome":"Not a Palindrome"));
    }
    public static void main(String[] args) {
        checkPalindrome("RADAR");
        checkPalindrome("MALAYALAM");
        checkPalindrome("MADAM");
        checkPalindrome("MADAME");

    }
}