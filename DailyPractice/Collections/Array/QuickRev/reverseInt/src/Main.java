//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void reverse(int a){
        int remainder=0;
        int reverse=0;
        while (a!=0){
            remainder=a%10;
            a=a/10;
            reverse=(reverse*10)+remainder;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        reverse(123455667);
    }
}