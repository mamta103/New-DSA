package midum_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        System.out.println(reversed);
    }
}
//Output: [40, 30, 20, 10]
