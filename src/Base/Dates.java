package Base;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


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


        System.out.println("------------------------");
        /* Exercise: write a function that asks day, month and year and compares it with the current date. If it is the same
         It will say "current date", if it is older it will say "older that", if it is newer, if will say "in the future".
         Check if the day is between 1 and 31, the month is between 1 and 12.
         Ternary operator:

         */
        System.out.println("Please insert a date and I will compare it: ");
        System.out.println("Please insert the day: ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        day = day > 0 && day < 32 ? day : 1;
        System.out.println("Please insert the month: ");
        int month = in.nextInt();
        month = month > 0 && month < 13 ? month : 1;
        System.out.println("Please insert the year: ");
        int year = in.nextInt();
        year = year > 0 && year < 2024 ? year : 1;

        String newDate = String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + String.format("%02d", year);
        System.out.println("Your date: " + newDate);

        System.out.println("Today's date: " + date.format(itDateFormat));

        System.out.println(date.format(itDateFormat).compareTo(newDate));

        if (date.format(itDateFormat).compareTo(newDate) == 0) {
            System.out.println("Your date is the current date!");
        } else if (date.format(itDateFormat).compareTo(newDate) == -1) {
            System.out.println("Your date is older than the current date");
        } else if (date.format(itDateFormat).compareTo(newDate) == 1) {
            System.out.println("Your date is in the future");
        };

        /*
        if (userInp > 0 && userInp < 13) {
            month = userInp;
        } else {
            month = 1;
        }
        */



        // With the ternary operator



    }
}
