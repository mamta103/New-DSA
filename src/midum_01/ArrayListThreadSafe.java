package midum_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListThreadSafe {
    public static void main(String[] args) {
        List<String > list = Collections.synchronizedList(new ArrayList<>());
    }
}
