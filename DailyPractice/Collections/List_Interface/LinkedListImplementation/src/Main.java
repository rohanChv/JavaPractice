//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Employee ramesh=new Employee("Ramesh","Muana",23,1);
            Employee mukesh=new Employee("Mukesh","Khanna",30,2);
            Employee gukesh=new Employee("Gukesh","Khanna",30,3);
            Employee sunil=new Employee("sunil","Ram",30,4);
            Employee rohan=new Employee("rohan","Ram",30,5);
            Employee rajesh=new Employee("rajesh","Ram",30,6);

            LinkedList list=new LinkedList();
            list.add(ramesh);
            list.add(mukesh);
            list.add(gukesh);
            list.add(sunil);
            list.add(rohan);
            list.add(rajesh);
            list.remove(ramesh);
            list.remove(gukesh);
            list.printList();
    }
}