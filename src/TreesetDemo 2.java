import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        Set<String>  set = new TreeSet<>();
        set.add(null);
        set.add("abc");
        System.out.println(set);

    }
}
