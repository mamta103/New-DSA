package CTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergerTwoSortedStringList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,19,8));

        List<Integer> result = Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        System.out.println(result);


    }
}
