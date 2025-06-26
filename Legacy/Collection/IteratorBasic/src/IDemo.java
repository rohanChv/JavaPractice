import java.util.*;

public class IDemo {
    public static void main(String[] args) {
        List<Integer> intList=new LinkedList<>();
        long timeBefore=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            intList.add(i);
        }
        System.out.println("Enter number to be found in Linked List");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        Iterator<Integer> listIterator=intList.iterator();
        while (listIterator.hasNext()){
            if(listIterator.next().equals(a)){
                System.out.println("element present");
                long operationEndTime=System.currentTimeMillis();
                System.out.println("time taken "+(operationEndTime-timeBefore));
                break;
            }
        }

    }
}
