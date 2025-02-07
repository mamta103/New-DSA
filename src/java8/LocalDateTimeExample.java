package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime; // Importing the correct class

public class LocalDateTimeExample { // Changed class name
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime now = LocalDateTime.now(); // Gets the current date and time

        System.out.println("LocalDate: " + localDate);
        System.out.println("LocalTime: " + localTime);
        System.out.println("LocalDateTime: " + now); // Corrected variable name
    }
}