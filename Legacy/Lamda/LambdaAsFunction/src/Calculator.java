public class Calculator {
    public static<T> void printResult(MathOperations m,T a,T b){
        System.out.println(m.run(a,b));
    }

    public static void main(String[] args) {
        MathOperations<Integer> multiplication=(a,b)->a*b;
        printResult(multiplication,3,4);
        MathOperations<Double>division=(a,b)->a/b;
        printResult(division,60.056,5.67);
    }
}
