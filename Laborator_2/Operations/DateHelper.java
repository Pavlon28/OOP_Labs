package Laborator_2.Operations;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    public static String formatDate(long timeStamp) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(new Date(timeStamp));
    }
}
