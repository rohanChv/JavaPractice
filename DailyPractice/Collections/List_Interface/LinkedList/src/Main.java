import java.util.LinkedList;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<>();
        list.add("Hello");
        list.add("CHAMPU");
        list.add("CHAMAN Champu");
        list.add("Jetha");
        System.out.println(list.poll());
        System.out.println(list.peek());
        ListIterator<String> itr= list.listIterator(list.size());
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
        Runtime sr=Runtime.getRuntime();
        System.out.println(sr.totalMemory()/(1024*1024));
        int i=0;
        
    }
}