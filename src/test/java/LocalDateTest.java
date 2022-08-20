import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void createLocalDate(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2001, Month.APRIL,3);
        LocalDate date3 = LocalDate.parse("1980-01-10");

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        //DATE and TIME bersifat immutable, data aslinya tidak akan berubah
        LocalDate date4 = date1.withYear(2010).withMonth(3);
        System.out.println(date4);

        LocalDate date5 = date2.plusMonths(9).minusYears(3);
        System.out.println(date5);
    }
}
