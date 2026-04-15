package stack;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OOM {
//    public static void main(String[] args) {
//        //System.out.println(generateTimeOptions("07:30"));
//    }

    public static String siteTimeZone = "Asia/Kolkata";

//    public static List<String> generateTimeOptions(String shiftStartTime) {
//        List<String> options = new ArrayList<>();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//        ZoneId zoneId = ZoneId.of(siteTimeZone);
////     LocalTime currentSystemTime = ZonedDateTime.now(zoneId).toLocalTime();
//        LocalTime currentSystemTime = LocalTime.of(7, 29);
//        LocalTime startTime = LocalTime.parse(shiftStartTime, formatter);
//        boolean crossesMidnight = currentSystemTime.isBefore(startTime);
//        System.out.println(crossesMidnight);
//        LocalTime t = startTime;
//        do {
//            options.add(t.format(formatter));
//            t = t.plusMinutes(1);
//            System.out.println(t);
//        } while (
//                (!crossesMidnight && !t.isAfter(currentSystemTime)) ||
//                        (crossesMidnight && ( !t.isAfter(currentSystemTime) || !t.isBefore(startTime) ))
//        );
//
//        return options;
//    }


public static void main(String[] args) {

    String[] testData = {"10", "20", "NaN", "Infinity", "", "ABC"};

    for (String value : testData) {
        try {
            System.out.println("Processing value: " + value);

            double num = Double.parseDouble(value);

            if (Double.isNaN(num) || Double.isInfinite(num)) {
                System.out.println("Invalid number detected: " + value);
                continue;
            }

            double result = num * 2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred for value: " + value);
        }
    }

    System.out.println("Thread completed normally");
}
}



