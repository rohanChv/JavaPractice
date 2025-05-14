import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int count=1;
    public static synchronized void increment(){
        ++count;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Thread one=new Thread(()->{
            for(int i=0;i<4000;i++){
                increment();
            }
            System.out.println("One Exit with counter as " + count);
        });
        Thread two=new Thread(()->{
            for(int i=0;i<4000;i++){
                increment();
            }
            System.out.println("Two Exit with counter as " + count);
        });
        one.start();
        two.start();

        List<Double> list11=Arrays.asList(660.0, 30.89, 97.86, 30.89, 660.0, 30.89, 97.86, 97.86, 97.86, 660.0, 30.89, 660.0);
        Double sum=list11.stream().reduce(0.0,Double::sum);
        List<BigDecimal>list1=list11.stream().map(BigDecimal::valueOf).collect(Collectors.toList());
        BigDecimal sum1=list1.stream().reduce(BigDecimal.ZERO,BigDecimal::add);
        System.out.println(sum.doubleValue()+","+sum1.doubleValue());
        Map<Integer,String> nameMap=new HashMap<Integer,String>();
        nameMap.put(1,"Raj");
        for(Map.Entry<Integer,String> element:nameMap.entrySet()){
            System.out.println(element.getKey());
        }

    }
}