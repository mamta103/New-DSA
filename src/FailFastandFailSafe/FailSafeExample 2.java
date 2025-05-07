package FailFastandFailSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList =  new CopyOnWriteArrayList<>(new String[]{"A","B","C"});

        Iterator<String> itr = copyOnWriteArrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            copyOnWriteArrayList.add("D"); // Modifying list while iterating (NO Exception)
        }

    }
}
