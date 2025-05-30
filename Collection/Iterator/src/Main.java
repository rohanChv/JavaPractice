import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> ageGroup=new ArrayList<>();
        for(int i=0;i<50;i++){
            ageGroup.add(i);
        }
        Iterator<Integer> ageIterator=ageGroup.iterator();
        while (ageIterator.hasNext()){
            Integer number=ageIterator.next();
            if(number<4){
                System.out.println("Removing "+ number);
                ageIterator.remove();
                continue;
            }
            if(number>=4&& number<=12){
                System.out.println("Half ticket applicable ->"+number);
                continue;
            }
            ageIterator.forEachRemaining((x) -> System.out.println("Ticket applicable is full ->" + ageIterator.next()));

        }
        for(int x:ageGroup){
            System.out.print(x+",");
        }
        String a="2.0923";
        double a1=Double.parseDouble(a);
        System.out.println(a1);

    }
}