package FailFastandFailSafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Iterator<String> itr=  list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            list.add("D");
        }
    }
}
