import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Ranks {
    public static void main(String[] args) {
        List<Results> resultsList=new ArrayList<Results>();
        resultsList.add(new Results(1,"Rohan",58.1,90.1,56.67));
        resultsList.add(new Results(1,"Raj",78.14535,80.1,96.67));
        resultsList.add(new Results(1,"Sam",78.1,50.1,46.67));

        System.out.println("Physics toppers :");
        resultsList.sort((a,b)->{
            if(b.physics==a.physics)
                return 0;
            if((b.physics-a.physics)<0)
                return -1;
            else
                return 1;
        });
        resultsList.forEach((result)-> System.out.println(result.name+":"+result.physics));
    }
}
