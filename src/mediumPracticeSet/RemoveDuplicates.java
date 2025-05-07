package mediumPracticeSet;

import java.util.*;

//1️⃣ Remove Duplicate Elements from an ArrayList
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> result = new ArrayList<>(set);
        System.out.println(result);
    }
}
