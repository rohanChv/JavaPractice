public class Factorial {
    public static void main(String[] args) {

        Calculate factorial=(n)->{
            int result=1;
            for(int i=1;i<=n;i++)
                result*=i;
            return result;
        };
        System.out.println("Factorial for 5 is : "+factorial.getValue(5));
    }
}
