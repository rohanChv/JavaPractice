import java.util.Scanner;

public class Fib {
    int inputNumber;
    int a=0;
    int b=1;
    public void TakeInput(){
        System.out.println("enter the Input number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(IsValidNumber(a))
            inputNumber=a;
        else
            TakeInput();
    }
    public boolean IsValidNumber(int a){
        if(a>0)
            return true;
        else
            return false;
    }
    public void PrintFibonnaciSeries(){
        int i=0;
        int c=0;
        for(i=0;i<inputNumber;i++){
            if(a==0 && b==1 && i==0){
                System.out.print(a+","+b+",");
                continue;
            }
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }

    }

    public static void main(String[] args) {
        Fib f1=new Fib();
        f1.TakeInput();
        f1.PrintFibonnaciSeries();
    }
}
