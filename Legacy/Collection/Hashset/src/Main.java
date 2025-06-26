import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> firstSet=new HashSet<>();
        firstSet.add(21);
        firstSet.add(31);
        firstSet.add(44);
        firstSet.add(59);
        System.out.println(firstSet);
        Set<Integer>secondSet=new LinkedHashSet<>();
        secondSet.add(21);
        secondSet.add(31);
        secondSet.add(44);
        secondSet.add(59);
        System.out.println(secondSet);//Insertion order is preserved;

    }
}