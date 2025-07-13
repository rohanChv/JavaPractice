import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile=new File("Hello.txt");
        if(!inputFile.exists())
            inputFile.createNewFile();
        RandomAccessFile fileRW=new RandomAccessFile(inputFile,"rw");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number one");
        int a=sc.nextInt();
        System.out.println("Enter number Two");
        int b=sc.nextInt();
        System.out.println("Enter Operator");
        char[] c=sc.next().toCharArray();
        Date currentDate=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a z");

        switch (c[0]){
            case '+':
                System.out.println("Result of addition is " +(a+b));
                fileRW.seek(fileRW.length());
                String result=Integer.toString(a+b);
                fileRW.writeBytes("\nResult of addition is "+result+"\nperformed on ->"+sdf.format(currentDate));
                break;
            case '-':
                System.out.println("Result of Subtraction is " +(a-b));
                fileRW.seek(fileRW.length());
                result=Integer.toString(a-b);
                fileRW.writeBytes("\nResult of Subtraction is "+result+"\nperformed on ->"+sdf.format(currentDate));
                break;
        }
    }
}