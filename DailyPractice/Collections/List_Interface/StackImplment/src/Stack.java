public class Stack <T>{
    private Node<T> head;
    private int count=0;
    public int getSize(){
        return count;
    }
    public void push(T o){
        Node<T> newNode=new Node<T>();
        newNode.setObj(o);
        if(head==null)
            head=newNode;
        else {
            Node<T>previousNode=head;
            head=newNode;
            head.setNextNode(previousNode);
        }
        ++count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void pop(){
        if(head==null)
            return;
        else {
            System.out.println("Poping this item -> "+head.getObj());
            head=head.getNextNode();
            --count;
        }
    }
}
