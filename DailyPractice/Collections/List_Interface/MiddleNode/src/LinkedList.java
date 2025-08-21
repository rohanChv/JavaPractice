public class LinkedList {
    Node head;
    public void add(Employee e){
        if(head==null){
            head=new Node();
            head.setEmp(e);
        }
        else{
            Node travesalNode=head;
            while (travesalNode.getNext()!=null){
                travesalNode=travesalNode.getNext();
            }
            Node newNode=new Node();
            newNode.setEmp(e);
            travesalNode.setNext(newNode);
        }
    }
    public void printAll(){
        Node traversalNode=head;
        while (traversalNode!=null){
            System.out.println(traversalNode.getEmp());
            traversalNode=traversalNode.getNext();
        }
    }
    public void contains(Employee e){
        Node traversalNode=head;
        while (traversalNode!=null){
            if(traversalNode.getEmp().compareTo(e)==0){
                System.out.println("Employee Detected =>"+e+"\n");
                break;
            }
            traversalNode=traversalNode.getNext();
        }
    }
    public void remove(Employee e){
        Node traversalNode=head;
        if(head.getEmp().compareTo(e)==0){
            head=head.getNext();
            return;
        }
        Node nextNode=new Node();
        while (traversalNode!=null){
            nextNode=traversalNode.getNext();
            if(nextNode.getEmp().compareTo(e)==0){
                System.out.println("Employee Detected =>"+e+"\n");
                System.out.println("Removing as Requested");
                traversalNode.setNext(nextNode.getNext());
                break;
            }
            traversalNode=traversalNode.getNext();
        }
    }
    public Employee getMiddleNodeEmployee(){
        Node fastNode=head;
        Node slowNode=head;
        while (fastNode.getNext().getNext()!=null && slowNode.getNext()!=null){
            if(fastNode.getNext().getNext()!=null && slowNode.getNext()!=null){
                fastNode=fastNode.getNext().getNext();
                slowNode=slowNode.getNext();
            }
            if(fastNode.getNext()==null){
                break;
            }
        }
        return slowNode.getEmp();
    }
}
