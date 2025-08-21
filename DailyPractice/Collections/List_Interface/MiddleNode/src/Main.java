//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        Employee ramesh=new Employee("Ramesh","Ram",1);
        Employee suresh=new Employee("Suresh","Ram1",2);
        Employee gukesh=new Employee("Gukesh","Not",3);
        Employee jetha=new Employee("Jetha","Gada",4);
        list.add(ramesh);
        list.add(suresh);
        list.add(gukesh);
        list.add(jetha);
        list.printAll();
        list.contains(gukesh);
        list.remove(gukesh);
        list.printAll();
        list.add(gukesh);
        list.add(gukesh);

        System.out.println("Middle Guy->"+ list.getMiddleNodeEmployee());
    }
}