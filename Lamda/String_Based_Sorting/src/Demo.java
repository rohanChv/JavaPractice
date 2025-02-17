import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> listStud=new ArrayList<String>();
        listStud.add("Ram");
        listStud.add("Tukaram");
        listStud.add("Raman");
        listStud.add("Roshan");
        listStud.add("Aiyyar");
        listStud.sort(Comparator.reverseOrder());
        System.out.println(listStud);
        //List of Objects
        List<Student> newStudentList=new ArrayList<>();
        newStudentList.add(new Student(1,"Rohan Chavan",45.67,71.34,89.4,90.0));
        newStudentList.add(new Student(2,"Rohan Pawar",35.67,61.34,49.4,80.0));
        newStudentList.add(new Student(3,"Rajesh Khanna",36.74,99.01,60.00,75.99));
        newStudentList.add(new Student(4,"Aiyyar",90.01,81,71.3,91.1));
        newStudentList.add(new Student(5,"Zelda",78.1,98,87,91));
        newStudentList.add(new Student(6,"Bapuji",81,45,67,71));

        Comparator<Student> comp= Comparator.comparing(Student::getName).reversed();
        newStudentList.sort(comp);
        newStudentList.forEach(System.out::println);
    }
}
