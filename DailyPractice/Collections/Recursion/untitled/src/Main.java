import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Factorials f=new Factorials();
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        System.out.println(f.calculate(sc.nextInt()));
    }
}