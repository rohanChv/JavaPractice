import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculatorDemo {
    public void displayOperation(Double a,Double b,Calculator c,String operation) throws IOException {
        try{
            Double result=c.calculate(a,b);
            Date currentDate=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a z");
            String operator=operation.equalsIgnoreCase("Multiplication")?"*":operation.equalsIgnoreCase("Addition")?"+":operation.equalsIgnoreCase("Division")?"/":"-";
            operation=operation.concat(" performed on "+sdf.format(currentDate)+"\n");
            operation=operation.concat(a+operator+b+" = "+result);
            FileWriter fos=new FileWriter("C:\\Users\\rohangch\\Documents\\JavaPractice\\DailyPractice\\Lambda\\BasicLambda\\CalculationsLog.Txt");
            FileReader fis=new FileReader("C:\\Users\\rohangch\\Documents\\JavaPractice\\DailyPractice\\Lambda\\BasicLambda\\CalculationsLog.Txt");

            System.out.println(operation);
            c.addToLogFile(operation,fos,fis);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Opertaion completed and Logged into File");
        }
    }
}
