package basic.LearnJava;
import java.util.*;
public class DateUtils {
    static final int MILLS_IN_DAY = 24 * 60 * 60 * 1000;
    public static Date getCurrentDate() {
        GregorianCalendar now = new GregorianCalendar();
        now.set(Calendar.HOUR, 10);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        return now.getTime();
    }

    public static Date stripTime(Date date){
        GregorianCalendar now = new GregorianCalendar();
        now.setTime(date);
        now.set(Calendar.HOUR, 10);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        return now.getTime();
    }
    public static Date createDate(int year, int month, int day) {
        GregorianCalendar date = new GregorianCalendar(year, month, day);
        return date.getTime();
    }

    public static int daysDiff(Date date1, Date date2) {
        date1 = stripTime(date1);
        date2 = stripTime(date2);
        long longDate1 = date1.getTime();
        long longDate2 = date2.getTime();
        long longDiff = longDate2 - longDate1;
        return (int) (longDiff / MILLS_IN_DAY);
    }
}
