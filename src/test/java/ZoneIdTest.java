import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneIdTest {

    @Test
    void create(){
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        Set<String> zones = ZoneId.getAvailableZoneIds();
        zones.forEach(System.out::println);

        ZoneOffset offset1 = ZoneOffset.of("+08:00");
        ZoneOffset offset2 = ZoneOffset.ofHours(-2);

        System.out.println(offset1);
        System.out.println(offset2);
    }
}
