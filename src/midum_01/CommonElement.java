package midum_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1️⃣4️⃣ Find Common Elements Between Two Lists
public class CommonElement {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 8, 9, 2));

        List<Integer> commonElement = list1.stream().filter(list2::contains).toList();
        System.out.println(commonElement);


       list2.retainAll(list1);
        System.out.println(list2);

    }
}
