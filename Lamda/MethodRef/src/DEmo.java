import java.util.ArrayList;
import java.util.List;

public class DEmo {

    public String checkEvenOdd(int a){
        if(a%2==0)
            return "Even";
        else
            return "Odd";
    }

    public void printNumbers(int a,Number n){
        System.out.println(a+" is "+n.Calculate(a));
    }

    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        for(int a =1;a<100;a++){
            intList.add(a);
        }
        DEmo d=new DEmo();
        intList.forEach(a->d.printNumbers(a,d::checkEvenOdd));
    }

}
