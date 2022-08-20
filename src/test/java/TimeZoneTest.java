import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {

    @Test
    void timeZoneTest(){
        TimeZone zone = TimeZone.getDefault();
        System.out.println(zone);

        String[] available = TimeZone.getAvailableIDs();
        Arrays.asList(available).forEach(System.out::println);
    }

    @Test
    void timeZoneCalendarTest(){
        Calendar localCalendar = Calendar.getInstance();
        Calendar gmtCalendaar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(localCalendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(gmtCalendaar.get(Calendar.HOUR_OF_DAY));
    }
}
