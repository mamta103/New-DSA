package midum_01;

import java.util.*;

//1️⃣9️⃣ Find Top 3 Max Numbers Without Sorting.
public class FindTopThreeElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 5, 30, 20, 50);
        Set<Integer> set = new TreeSet<>(nums);
        List<Integer> topThree = set.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed()).limit(3).toList();
        System.out.println(topThree);

    }
}
