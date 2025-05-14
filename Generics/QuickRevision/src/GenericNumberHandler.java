import java.util.List;

public class GenericNumberHandler <T extends Number>{
    double average;
    double sum;
     public void calculateAverage(List<T> inputList){
         for(T element : inputList){
             sum+=element.doubleValue();
         }
     }
    public void display(GenericNumberHandler<?> object){
        System.out.println(object.sum);
    }

}
