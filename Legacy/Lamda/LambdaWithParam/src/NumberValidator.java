public class NumberValidator {
    public static void main(String[] args) {
        Validate isEven=(n)->n%2==0;
        System.out.println("20 is Even :"+isEven.valid(20));
        Validate isNegative=(n)->n<0;
        System.out.println("34 is Negative : "+ isNegative.valid(34));
    }
}
