import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

    @Test
    void create(){
        var date = new Date();
        var date2 = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();

        System.out.println(date);
        System.out.println(date2);

        calendar.set(Calendar.YEAR,2001);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH,3);

        Date date3 = calendar.getTime();

        System.out.println(date3);

        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
    }
}
