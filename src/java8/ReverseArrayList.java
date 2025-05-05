package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);

        System.out.println("Original List: " + list);
//        List<Integer> reversedList ;
        List<Integer> reversedList = list.reversed().stream().toList();
        System.out.println(reversedList);


    }
}
