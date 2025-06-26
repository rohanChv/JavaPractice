public class Main {
    public static void calculate(Calculator c, double a, double b){
        System.out.println("Result is " + c.takeInputNumber(a,b));
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator myadd=Double::sum;
        calculate(myadd,2.0,3.0);
        calculate((a,b)->a-b,4.0,5.0);
        calculate((a,b)->a>b?1.0:-1.0,7.0,8.0);
        calculate((a,b)->a/b,9.0,6.0);
        //calculate(ReferCalculation::returnCube,3.0,4.0);
    }
}