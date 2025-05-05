package java7;

import java.util.List;

public class FindMinElement {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 1, 7, 2, 3, 8);
        int minElement = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (minElement > numbers.get(i)) {
                minElement = numbers.get(i);
            }

        }
        System.out.println(minElement);
    }
}
