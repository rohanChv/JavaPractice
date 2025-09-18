import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void createList(){
        ArrayList<Integer>li=new ArrayList<>();
        int a=9;
        addList(li,a);
        System.out.println(li);
        System.out.println(a);
    }
    private static void addList(ArrayList li,int a){
        li.add(1);
        li.add(2);
        a=10;
    }
    public static void main(String[] args) {
        createList();
    }
    
}