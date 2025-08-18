import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Hello");
        list.add(1,"Add by index");
        list.addFirst("Added in Start");
        list.addLast("Added in Last");
        list.add("Hi");
        list.remove("Hi");
        System.out.println("First=>"+list.getFirst());
        System.out.println("Last=>"+list.getLast());
        System.out.println(list.get(3));
        System.out.println(list.contains("Hi"));
        Iterator<String> listIt= list.iterator();
        while (listIt.hasNext()){
            System.out.print(listIt.next()+",");
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}