package dateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeClass {
    static void main() {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);
    }
}
