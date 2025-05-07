package midum_01;

import java.util.*;

public class ConvertToSetViceVersa {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a");

        Set<String> set = new HashSet<>(list);
        System.out.println("Set: " + set);

        List<String> backToList = new ArrayList<>(set);
        System.out.println("List: " + backToList);

    }
}
//Set: [a, b]
//List: [a, b]