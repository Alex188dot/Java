package Base;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Dates {
    public static void main(String[] args) {
        // Current date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // Compare two dates - Will return 1 if the one in parentheses is older, -1 if date is older, 0 if they are equal
        LocalDate date1 = LocalDate.of(2022, 7, 25);
        System.out.println(date.compareTo(date1));

        // Current hour
        LocalTime hour = LocalTime.now();
        System.out.println(hour); // This is local time hour:minutes:secs.milliseconds

        // Current date and hour
        System.out.println(date + " " + hour);

        // How to format the date - DataTimeFormatter Library
        DateTimeFormatter itDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Italian date format: " + date.format(itDateFormat));

        // Format months into text
        DateTimeFormatter dateMonth = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Date month text: " + date.format(dateMonth));

        // Format day into text
        DateTimeFormatter dateDay = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        System.out.println("Day: " + date.format(dateDay));

        // Remove seconds
        DateTimeFormatter hourMinutes = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Hour and minutes: " + hour.format(hourMinutes));

        // Add seconds
        DateTimeFormatter hourMinutesSeconds = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hour, minutes, seconds: " + hour.format(hourMinutesSeconds));

        // Full date - T means after date is Time
        LocalDateTime completeDate = LocalDateTime.now();
        System.out.println(completeDate);

        // Format full date
        DateTimeFormatter itCompleteDate = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm");
        System.out.println("Complete formatted date: " +completeDate.format(itCompleteDate));
    }
}
