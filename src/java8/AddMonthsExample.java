package java8;

import java.time.LocalDate;

public class AddMonthsExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate localDate = LocalDate.now();
        
        // Add 2 months to the current date
        LocalDate newDate = localDate.plusMonths(2);
        
        // Print the new date after adding 2 months
        System.out.println("New LocalDate After Adding 2 months: " + newDate);
    }
}
