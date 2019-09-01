import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //calendar.set(Calendar.YEAR,1992);
        calendar.add(Calendar.MINUTE,-18);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = sdf.format(date);
        String d2 = sdf.format(calendar.getTime());
        System.out.println(date);
        System.out.println(calendar.getTime());
        Long time1 = date.getTime();
        Long time2 = calendar.getTime().getTime();
        System.out.println(time2);
        System.out.println((time1 - time2)/(1000*60));





    }
}
