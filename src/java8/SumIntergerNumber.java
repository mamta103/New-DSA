package java8;

import java.util.Arrays;
import java.util.List;

public class SumIntergerNumber {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(12,45,67,89,90);

       long result =  list.stream().count();
        System.out.println(result);
    }
}
