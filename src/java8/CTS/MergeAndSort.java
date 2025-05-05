package java8.CTS;
//1️⃣ Merge and Sort in Ascending Order (Default)

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeAndSort {
    public static void main(String[] args) {
        // Two sorted lists
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).sorted(Integer::compareTo).toList();
        System.out.println(mergedList);

        //    2️⃣ Merge and Sort in Descending Order
        List<Integer> descmMergedList = Stream.concat(list1.stream(), list2.stream()).sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(descmMergedList);
    }


}
