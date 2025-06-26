import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Price> basePriceList= Arrays.asList(new Price(1.0,0.0),new Price(null,1.0),new Price(null,null),new Price(5.0,4.0),new Price(44.5,null));
        Optional<Price> base=basePriceList.stream().max(Comparator.comparing(Price::getBasePrice,(Comparator.nullsFirst(Comparator.naturalOrder()))));
        System.out.println(base.get().getBasePrice());

        
        Date newDate=new Date();
        System.out.println(newDate);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        int i=9;
        if(i==9){
            System.out.println("Chomu");
        }
        else if(i==9){
            System.out.println("Double Chomu");
        }
    }
}