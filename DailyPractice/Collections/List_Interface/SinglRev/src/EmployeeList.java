public class EmployeeList {
    EmployeeNode head;
    int size;
    public void add (Employee emp){
        EmployeeNode node=new EmployeeNode(emp);
        node.setNext(head);
        head=node;
        ++size;
    }
    public void getSize(){
        System.out.println(size);
    }
    public void print(){
        EmployeeNode current=head;
        while (current!=null){
            System.out.println(current.getEmp().toString());
            current=current.getNext();
        }
    }
}
