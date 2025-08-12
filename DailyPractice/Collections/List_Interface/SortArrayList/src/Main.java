import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ascending
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(6);
        ArrayList<Integer>clone=(ArrayList<Integer>)arrayList.clone();
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //Descending
        Collections.sort(clone,Collections.reverseOrder());
        System.out.println(clone);
    }
}