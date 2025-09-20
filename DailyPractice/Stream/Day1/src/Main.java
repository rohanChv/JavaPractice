import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(54);
        list.add(34);
        list.add(19);
        list.add(21);
        list.add(9);
        list.add(634);
        Optional<Integer> a=list.stream().max(Integer::compareTo);
        System.out.println(a.get());
        list.stream().limit(4).forEach(System.out::println);
        //Even Numbers
        list.stream().filter(e->e%2==0).forEach(i->System.out.print(i+","));
        //New Mapping
        List<Integer> newList=list.stream().map(e->e^2).collect(Collectors.toList());
        System.out.println(newList);
        //reduction sum of all numbers
        Integer sum=list.stream().reduce(0,(b,c)->b+c);
        System.out.println(sum);
        Optional<Integer> newSum=list.stream().reduce(Integer::sum);
        System.out.println(newSum.get());
    }
}