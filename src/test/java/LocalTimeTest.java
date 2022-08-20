import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeTest {

    //representasi prefix nya hampir sama dengan localDate
    @Test
    void create(){
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(12,30);
        LocalTime time3 = LocalTime.parse("12:00:10.1931");

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        int hour = time1.getHour();
        System.out.println(hour);
    }
}
