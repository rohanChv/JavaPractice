public class LinkedList {
    private Node head;

    public void add(String s){
        if(head==null){
            Node newNode=new Node();
            newNode.setS(s);
            head=newNode;
        }
        else {
            Node currentNode=head;
            while (currentNode!=null){
                if(currentNode.getNext()==null){
                    Node newNode=new Node();
                    newNode.setS(s);
                    currentNode.setNext(newNode);
                    break;
                }
                currentNode=currentNode.getNext();

            }
        }
    }
    public void print(){
        Node currentNode=head;
        while (currentNode!=null){
            System.out.print(currentNode.getS()+",");
            currentNode=currentNode.getNext();
        }
    }
    public void reverse(){
        Node current=head;
        Node previous=head;
        Node nextNode=head.getNext();
        Node traversalNode=head;
        while (traversalNode!=null){
            if (traversalNode!=null){
                nextNode=traversalNode.getNext();
                traversalNode.setNext(previous);
            }
        }
    }
}
