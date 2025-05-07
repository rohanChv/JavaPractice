import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        try{
            double inputNumber=Math.random()*100;
            BigDecimal input=new BigDecimal(Double.valueOf(inputNumber));
            input=input.setScale(2,RoundingMode.DOWN);
            DecimalFormat df=new DecimalFormat("##.##");
            System.out.println("Before format "+ inputNumber);
            System.out.println("Before after "+df.format(inputNumber));
            System.out.println("Round->"+input);
            System.out.println(inputNumber);
            int result=(int)inputNumber/1;
            System.out.println(result);
            throw  new ArithmeticException();
        }catch (Exception e){
            System.out.println("Exception Caught");
        }finally {
            System.out.println("In finally Block");
        }
    }
}