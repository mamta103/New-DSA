package midum_01;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(3, 4, 5);
        Set<Integer> set = new LinkedHashSet<>(a);
        set.addAll(b);
        List<Integer> result = new LinkedList<>(set);
        System.out.println(result);

    }
}
