package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Printer {
    public void print(String description, double value) {
        System.out.println(description + value);
    }

    public void printDateTime(String format) {
        LocalDate date = LocalDate.now();
        String text = date.format(DateTimeFormatter.ofPattern(format));
        System.out.println(text);
    }
}
