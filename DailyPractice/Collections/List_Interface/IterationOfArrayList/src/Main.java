import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //for loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //enhaced For Loop
        System.out.println("Enhanced For Loop");
        for(int x: list){
            System.out.println(x);
        }
        //While Loop
        int count=0;
        System.out.println("While Loop");
        while(count< list.size()){
            System.out.println(list.get(count));
            ++count;
        }
        //Iterator
        Iterator<Integer>itr= list.iterator();
        System.out.println("Iterator->");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //Stream
        System.out.println("Stream");
        list.forEach(System.out::println);
    }
}