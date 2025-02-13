import java.util.Arrays;
import java.util.List;

public class SimpleIntSort {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,5,6,7,8,9,100,234,456,678,23,56);
        System.out.println("List is  ->"+integerList);
        integerList.sort(null);
        System.out.println("Ascending sort ->"+integerList);
        //descending Sort
        integerList.sort((a,b)->b-a);
        System.out.println("Decending Order ->"+integerList);
    }
}
