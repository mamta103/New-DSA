package Revision_1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add(null);
    }
}
// Output: Exception in thread "main" java.lang.NullPointerExceptions
