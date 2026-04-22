package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterApp {
    static void main() {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(format1));


    }
}
