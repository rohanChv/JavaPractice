public class LinkedList {
    Node head;

    public void add(Employee e){
        Node newNode=new Node();
        newNode.setEmp(e);
        if(head==null){
            head=newNode;
        }
        else {
            Node traversalNode;
            traversalNode=head;
            while (traversalNode!=null){
                if(traversalNode.getNext()==null){
                    traversalNode.setNext(newNode);
                    break;
                }
                traversalNode=traversalNode.getNext();
            }
        }
    }
    public void remove(Employee e){
        if(head.getEmp().compareTo(e)==0){
            head=head.getNext();
            return;
        }
        Node currentNode=head;
        while (currentNode!=null){
            Node nextNode=currentNode.getNext();
            if((nextNode.getEmp().compareTo(e)==0)){
                currentNode.setNext(nextNode.getNext());
                return;
            }
            currentNode=currentNode.getNext();
        }
    }


    public void printList(){
        Node traversalNode=new Node();
        traversalNode=head;
        while (traversalNode!=null){
            System.out.println(traversalNode.getEmp());
            traversalNode=traversalNode.getNext();
        }
    }

}
