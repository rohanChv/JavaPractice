import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();// default capacity 10
        // add methods add(),addAll(),add(index,Element)
        list.add("Bhide");
        list.addAll(Arrays.asList("Atma","Tuka"));
        list.add(1,"Bapu");
        System.out.println(list);
        //access get(index)
        System.out.println("get 1 "+list.get(1));
        //set
        System.out.println("set 1");
        list.set(1,"Bapuji");
        System.out.println(list);
        //contains
        System.out.println(list.contains("Bapuji"));
        //Clone
        ArrayList<String> newList=(ArrayList<String>)list.clone();
        //remove(int index),remove(Object),removeAll(),removeIf()
        //remove with Index
        newList.remove("Bapuji");
        System.out.println("Removed with Object " +newList);
        newList.remove(2);
        System.out.println("removed with index 2 "+newList);
        newList.removeAll(Arrays.asList("Atma","Tuka"));
        System.out.println("Remove with collection "+newList);
        newList.removeIf(e->e.equalsIgnoreCase("bhide"));
        System.out.println("Removed with condition "+newList);
        //subList
        System.out.println(list.subList(1,4));
        //toArray
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);
        list.forEach(e->{
            e=e.concat("Champu");
            newList.add(e);
        });
        System.out.println(newList);
        System.out.println(list);
    }
}