import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {

    @Test
    void create(){
        ZonedDateTime dateTime = ZonedDateTime.now();
        ZonedDateTime dateTime1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
        ZonedDateTime dateTime2 = ZonedDateTime.parse("2001-04-03T10:10:10+05:00");
        //walaupun time zone nya salah, outputnya tetap menyesuaikan zone id nya
        ZonedDateTime dateTime3 = ZonedDateTime.parse("2001-04-03T10:10:10+00:00[Asia/Jakarta]");

        System.out.println(dateTime);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
    }
}
