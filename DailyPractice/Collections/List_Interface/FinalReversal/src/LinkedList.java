public class LinkedList <T>{
    Node<T> head;
    public void add(T o){
        Node<T> newNode=new Node<T>();
        newNode.setObject(o);
        if(head==null){
            head=newNode;
        }
        else {
            Node<T> traversalNode=head;
            while (traversalNode!=null){
                if (traversalNode.getNextNode()==null){
                    traversalNode.setNextNode(newNode);
                    break;
                }
                traversalNode=traversalNode.getNextNode();
            }

        }
    }
    public void printAll(){
        Node<T> traversalNode=head;
        while (traversalNode!=null){
            System.out.println(traversalNode.getObject());
            traversalNode=traversalNode.getNextNode();
        }
    }
    public void getMiddleNode(){
        Node<T> firstPointer=head;
        Node<T>secondPointer=head;
        while (firstPointer.getNextNode()!=null && secondPointer.getNextNode().getNextNode()!=null){
            firstPointer=firstPointer.getNextNode();
            secondPointer=secondPointer.getNextNode().getNextNode();
            if(secondPointer.getNextNode()==null){
                break;
            }
        }
        System.out.println("Middle Node -> "+firstPointer.getObject());
    }
    public void inPlaceReversal(){
        Node<T> previous=null;
        Node<T> currentNode=head;
        Node<T> nextNode=currentNode.getNextNode();
        while (currentNode!=null){
            head=currentNode;
            currentNode.setNextNode(previous);
            previous=currentNode;
            currentNode=nextNode;
            if(nextNode!=null){
                nextNode=nextNode.getNextNode();
            }
        }
    }
}
