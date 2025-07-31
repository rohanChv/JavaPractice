public class Factorials {
    int number;
    public long calculate(int num){
        return factorial(num);
    }
    public long factorial(int num){
        this.number=num;
        if(number==0){
            return 1;
        }
        System.out.println(number+","+(number-1));
            return number*factorial(number-1);
    }
}
