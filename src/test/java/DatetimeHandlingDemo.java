import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetimeHandlingDemo {

    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy:hh/mm/ss");
        String currentDate = simpleDateFormat.format(date.getTime());

        System.out.println(currentDate);
    }
}
