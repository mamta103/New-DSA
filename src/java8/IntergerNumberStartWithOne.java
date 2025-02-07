package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntergerNumberStartWithOne {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(12,45,67,89,90);
//        logic : need to first change in string
        List<String> listResult = list.stream().map(s->s+"").filter(s->s.startsWith("1")).toList();

    }
}
