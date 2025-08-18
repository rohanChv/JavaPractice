//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPallindrome(String s){
       int i=0;
       int j=s.length()-1;
       while (i<=j){
           if(s.charAt(i)!=s.charAt(j))
               return false;
           --j;
           ++i;
       }
       return true;
    }
    public static void main(String[] args) {
        System.out.println(isPallindrome("madam"));
    }
}