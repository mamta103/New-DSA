package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListDecendingOrder {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(100);
        list.add(5);
        list.add(33);

        System.out.println("Orginal Input Order: "+ list);
        //How to sort ArrayList in descending order?
        List<Integer>  result =  list.stream().sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println("result :"+ result);
    }
}
