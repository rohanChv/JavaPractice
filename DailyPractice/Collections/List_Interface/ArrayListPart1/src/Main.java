import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Initialize ArrayList
        ArrayList<Integer> list=new ArrayList<>();//default implementation
//        other ways are:
//        List<Integer> list=new ArrayList<>(20);->with new capacity
//        List<Integer> arrList=new ArrayList<>(list);->With another Collection
        list.ensureCapacity(20);//ensure that capacity is kept
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.trimToSize();//Trim to size and ensure capacity will work only for ArrayList and not list interface
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(3));//check if element is present in List
        System.out.println(list.indexOf(3));//check index of element
        System.out.println(list.lastIndexOf(3));//last known index of the given element
        for(Object x:list.toArray()){
            System.out.print(x+",");
        }
        System.out.println(list.get(3));//get eelemet at that list
        System.out.println(list.set(3,4));//set element at that index it will replace element
        list.add(3,15);//add element at index and then shift elements
        System.out.println(list.get(3));
        System.out.println(list);
        list.remove((Object)3);//remove first occurance cast to Object to Ignore Index
        System.out.println(list);
        System.out.println(list.subList(1,4));//get Specific Portion
        list.addAll(list.subList(1,4));//added at end
        System.out.println(list);
        list.addAll(6,list.subList(1,5));
        System.out.println(list);
    }
}