//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator addtion=(a,b)->a+b;
        Calculator subtraction=(a,b)->a-b;
        Calculator division=(a,b)->a/b;
        Calculator multiplication=(a,b)->a*b;

        CalculatorDemo demo=new CalculatorDemo();
        try{
            demo.displayOperation(2.0,39.0,addtion,"addition");
            demo.displayOperation(2.0,35.0,subtraction,"Subtraction");
            demo.displayOperation(25.0,3.0,multiplication,"Multiplication");
            demo.displayOperation(21.0,3.0,division,"Division");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}