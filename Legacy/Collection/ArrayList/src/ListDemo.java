import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();
        nameList.add("Ramesh Sippi");
        nameList.add("Bapuji");
        nameList.add("Zelda");
        nameList.add("Rajan");
        nameList.add("Anna");
        nameList.add("Peter");
        nameList.add("Champaklaal");
        nameList.add("Popatlal");
        nameList.add("Jetha");
        nameList.sort(null);
        nameList.forEach(System.out::println);
        //Add All
        List<String> newAddmission=new ArrayList<>();
        newAddmission.add("Babita");
        newAddmission.add("Anjali");
        newAddmission.add("Daya");
        newAddmission.add("Komal");
        nameList.addAll(newAddmission);
        nameList.set(2,"HIMAL");
        nameList.forEach(System.out::println);

    }
}
