import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return 01-02;
    }
}

public class AList {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<Integer>();
        for (int i=0;i<100;i++){
            integerList.add(i);
        }
        integerList.sort(new MyComparator());
        System.out.println(integerList);

    }
}
