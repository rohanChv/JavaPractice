//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Employee>list=new LinkedList<>();
        list.add(new Employee("Ramesh","Ram",1));
        list.add(new Employee("Mike","Channing",2));
        list.add(new Employee("Suresh","Ram",3));
        list.add(new Employee("Mithilesh","Ram",4));
        list.add(new Employee("Simran","Ram",5));
        list.add(new Employee("Host",
                "Ram",6));
        list.add(new Employee("Ghost","Ram",7));
        System.out.println("Employee List ->");
        list.printAll();
        System.out.println("Middle Node ->");
        list.getMiddleNode();
        System.out.println("Reverse List ->");
        list.inPlaceReversal();
        list.printAll();

        LinkedList<String> stringList=new LinkedList<>();
        stringList.add("Hello");
        stringList.add("There");
        stringList.add("New List");
        stringList.add("HelloLast");
        stringList.printAll();
        stringList.inPlaceReversal();
        stringList.printAll();
    }
}