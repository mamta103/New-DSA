package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HandleConcurrentModificationException {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Amit", "Priya", "Rahul"));
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String  name = iterator.next();
            if(name.equals("Rahul")){
                iterator.remove();
            }
        }
        System.out.println(names);  // Output: [Amit, Priya]

    }
}
