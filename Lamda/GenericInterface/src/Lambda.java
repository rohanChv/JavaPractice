public class Lambda {
    public static void main(String[] args) {
        CalculationInterface<String> stringReverse=(s)->{
             String reverse="";
             for(int i=s.length()-1;i>=0;i--)
                 reverse+=s.charAt(i);
             return reverse;
        };
        System.out.println("Reversed String of Lambda is : "+stringReverse.performOperations("Lambda"));
        CalculationInterface<Integer> factorial=(n)->{
            int result=1;
            for(int i=1;i<=n;i++){
                result*=i;
            }
            return result;
        };
        System.out.println("Factorial of 5 is : "+ factorial.performOperations(5));
    }
}
