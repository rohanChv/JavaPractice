//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  int reverseInteger(int a){
        int reverse=0;
        int mod=0;
        while (a!=0){
            mod=a%10;
            a/=10;
            reverse=(reverse*10)+mod;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverseInteger(1263455));
    }
}