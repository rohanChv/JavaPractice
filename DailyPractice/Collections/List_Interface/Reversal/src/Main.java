//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee ramesh=new Employee("ramesh","Gunde",1);
        Employee suresh=new Employee("suresh","MAn",2);
        Employee shankar=new Employee("shankar","MAn",3);
        Employee Mukesh=new Employee("Mukesh","MAn",4);
        Employee Gukesh=new Employee("Gukesh","MAn",5);
        LinkedList list=new LinkedList();
        list.add(ramesh);
        list.add(suresh);
        list.add(shankar);
        list.add(Mukesh);
        list.add(Gukesh);
        list.middleNode();
        System.out.println("Before Reversal ->");
        list.printAll();
        list.reversalInplace();
        System.out.println("After Reversal ->");
        list.printAll();
    }
}