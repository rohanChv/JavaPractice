public class LinkedList {
    Node head;
    public void add(Employee e){
        Node newNode=new Node();
        newNode.setEmp(e);
        if(head==null){
            head=newNode;
        }
        else {
            Node traversalNode=head;
            while (traversalNode!=null){
                if(traversalNode.getNextNode()==null){
                    traversalNode.setNextNode(newNode);
                    break;
                }
                traversalNode=traversalNode.getNextNode();
            }
        }
    }
    public void middleNode(){
        Node slowNode=head;
        Node fastNode=head;
        while(slowNode.getNextNode()!=null && fastNode.getNextNode().getNextNode()!=null){
            slowNode=slowNode.getNextNode();
            fastNode=fastNode.getNextNode().getNextNode();
            if (fastNode.getNextNode()==null){
                break;
            }
        }
        System.out.println("Middle Node -> "+slowNode.getEmp());
    }
    public void reversalInplace(){
        Node previous=null;
        Node currentNode=head;
        Node nextNode;
        while (currentNode!=null){
            nextNode=currentNode.getNextNode();
            currentNode.setNextNode(previous);
            previous=currentNode;
            currentNode=nextNode;
            if(currentNode!=null)
                head=currentNode;
        }
    }
    public void printAll(){
        Node travesalNode=head;
        while (travesalNode!=null){
            System.out.println(travesalNode.getEmp());
            travesalNode=travesalNode.getNextNode();
        }
    }
}
