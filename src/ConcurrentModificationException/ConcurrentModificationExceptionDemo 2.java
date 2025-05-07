package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Amit", "Priya", "Rahul", "Sneha"));
        for(String name:names){
           if(name.equals("Priya") || name.equals("Sneha"))
               names.remove(name);
        }
    }
}
