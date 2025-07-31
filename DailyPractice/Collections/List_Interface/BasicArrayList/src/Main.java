import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Default Size of ArrayList is 10.
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(null);
        for(int x:list){
            System.out.println(x);//Null Pointer Excp For Element.
        }
        System.out.println(list.indexOf(30));
    }
}