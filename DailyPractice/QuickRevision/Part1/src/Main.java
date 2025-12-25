import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <Stack> void main(String[] args) {
        int A=3;
        String[] s=new String[A];
        for(Integer i=0;i<A;i++){
            Integer a=i+1;
            String input=a.toString();
            if(a%3==0 && a%5==0){
                input="FizzBuzz";
            }
            else if(a%3==0 && a%5!=0){
                input="Fizz";
            }
            else if(a%5==0 && a%3!=0){
                input="Buzz";
            }
            s[i]=input;
            input="";
        }
        System.out.println(Arrays.toString(s));
    }
}
