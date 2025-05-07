package java7;

import java.util.ArrayList;
import java.util.List;

public class StreamAPis {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(3, 7, 1, 7, 2, 3, 8);


        List<Integer> numbers = new ArrayList<>(List.of(3, 7, 1, 7, 2, 3, 8));
        numbers.clear();

        // Handle empty list safely
        if (numbers.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            // Using Stream API to find the maximum value
            int max = numbers.stream().min(Integer::compareTo).orElseThrow(() -> new RuntimeException());
            System.out.println("Maximum value: " + max);
        }

    }
}
