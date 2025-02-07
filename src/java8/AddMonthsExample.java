package java8; import java.time.LocalDate;

public class AddMonthsExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate newDate = localDate.plusMonths(2);
        System.out.println("New LocalDate After Adding 2 months: " + newDate);
    }
}