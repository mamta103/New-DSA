package midum_01;

import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<String> list = List.of("one","two");
//        List<String> list = new ArrayList<String>(Arrays.asList("one"));
        System.out.println(list);
        list.add("three");
        System.out.println(list);


    }
}
