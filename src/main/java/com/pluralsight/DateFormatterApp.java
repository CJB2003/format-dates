package com.pluralsight;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterApp {

    static ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));

    static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        //format for first display in month/day/year
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //format for second display in month-day-year
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //format in full name of day, the day in numerical format and year
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");

        //full name of day, abbreviated month and numerical day, numerical full year
        //and then a formatted time for hours and minutes
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");

        //print them all out
        System.out.println(gmt.format(format1));
        System.out.println(gmt.format(format2));
        System.out.println(gmt.format(format3));
        System.out.println(gmt.format(format4));
    }
}
