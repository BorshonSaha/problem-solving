package dateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    static void main() {
        Date date = new Date();
        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println(currentDate);
    }
}
