import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> firstSet=new TreeSet<>(Comparator.reverseOrder());
        firstSet.add(1);
        firstSet.add(23);
        firstSet.add(20);
        firstSet.add(15);
        firstSet.add(2);
        System.out.println(firstSet);
        System.out.println(firstSet.headSet(4));
        System.out.println(firstSet.tailSet(2));
        System.out.println(firstSet.subSet(23,2));
        System.out.println(firstSet.contains(15));
        Iterator<Integer> it= firstSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        SortedSet<Integer>secondSet=new TreeSet<>();
        secondSet.addAll(firstSet);
        System.out.println(secondSet);


    }
}