import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,5);
        GenericNumberHandler<Integer> gen=new GenericNumberHandler<>();
        gen.calculateAverage(list);
        GenericNumberHandler<Double>doubleGen=new GenericNumberHandler<>();
        List<Double> dList=Arrays.asList(1.0,2.0,3.0);
        doubleGen.calculateAverage(dList);
        gen.display(doubleGen);
    }
}