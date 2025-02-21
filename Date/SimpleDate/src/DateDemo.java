import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date currentDate=new Date();
        System.out.println(currentDate);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:SS");
        System.out.println(sdf.format(currentDate));
        BigDecimal bigDec=BigDecimal.valueOf(23.56701);
        System.out.println(bigDec.setScale(2,BigDecimal.ROUND_HALF_UP));


    }
}
