public class EmployeeList {
    EmployeeNode head;
    public void add(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
        head=node;
    }
    public void print(){
        EmployeeNode current;
        current=head;
        while(current!=null){
            System.out.println(current.getEmp().toString());
            current=current.getNext();
        }
    }
}
