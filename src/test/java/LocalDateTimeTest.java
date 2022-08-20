import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeTest {

    //DateTime juga memiliki kelas Year, YearMonth dan MonthDay dari java.time.*

    @Test
    void create(){
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime1 = LocalDateTime.parse("2022-08-17T13:47:08.1931");

        System.out.println(dateTime);
        System.out.println(dateTime1);

        //konversi ke local date (toLocalDate()) dan local time (toLocalTime())
        LocalDate date = dateTime.toLocalDate();
        System.out.println(date);
        System.out.println(date.atTime(12,12));
    }
}
