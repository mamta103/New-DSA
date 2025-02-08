package java8;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        //1. Create a LocalDate for February 5, 2025
        LocalDate date = LocalDate.of(2025, 2, 5);
        System.out.println("LocalDate: " + date); // Output: 2025-02-05

        //2. Create a LocalDate Using Month Enum
        date = LocalDate.of(2025, Month.FEBRUARY, 5);
        System.out.println("LocalDate: " + date); // Output: 2025-02-05

//        3. Create a LocalDate for the Current Date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate); // Output: Current system date (e.g., 2023-10-25)

        // 4. Create a LocalDate by Parsing a String
        date = LocalDate.parse("2025-02-05");
        System.out.println("Parsed LocalDate: " + date); // Output: 2025-02-05


        //5. Create a LocalDate Using Year and DayOfYear
        // Create a LocalDate for the 36th day of the year 2025
      date  = LocalDate.ofYearDay(2025, 32);
        System.out.println("LocalDate from Year and Day: " + date); // Output: 2025-02-05

    }
}
