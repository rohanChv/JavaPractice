import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date=new Date();
        date.setTime(System.currentTimeMillis());
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        System.out.println(date);
    }
}
