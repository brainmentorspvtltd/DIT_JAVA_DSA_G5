import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        // System.out.println(d.getTime());
        // System.out.println(d.getMinutes());
        Calendar c= Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.MONTH,11);
        
        System.out.println(c.getTime());
    }
}
