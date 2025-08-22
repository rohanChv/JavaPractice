public class LinkedList {
    Node head;
    public void add(String s){
        if(head==null){
            Node newNode=new Node();
            newNode.setA(s);
            head=newNode;
        }
        else {
            Node traversalNode=head;
            while (traversalNode!=null){
                if(traversalNode.getNextNode()==null){
                    Node newNode=new Node();
                    newNode.setA(s);
                    traversalNode.setNextNode(newNode);
                    break;
                }
                traversalNode=traversalNode.getNextNode();
            }
        }
    }
    public void getMiddleNode(){
        Node fastNode=head;
        Node slowNode=head;
        while (slowNode.getNextNode()!=null && fastNode.getNextNode().getNextNode()!=null){
            fastNode=fastNode.getNextNode().getNextNode();
            slowNode=slowNode.getNextNode();
            if(fastNode.getNextNode()==null){
                break;
            }
        }
        System.out.println("\nMiddle Node is => "+slowNode.getA());
    }
    public void printAll(){
        Node traversalnode=head;
        System.out.print("[");
        while (traversalnode!=null){
            System.out.print(traversalnode.getA()+",");
            traversalnode=traversalnode.getNextNode();
        }
        System.out.print("]");
    }
    public void inPlaceReversal(){
        Node currentNode=head;
        Node nextNode=currentNode.getNextNode();
        Node previousNode=null;
        while (nextNode!=null){
           currentNode.setNextNode(previousNode);
           previousNode=currentNode;
           currentNode=nextNode;
           nextNode=nextNode.getNextNode();
           head=currentNode;
           if(nextNode==null){
               currentNode.setNextNode(previousNode);
           }
        }
        System.out.println("Printing after reversal");
        this.printAll();
    }

}
