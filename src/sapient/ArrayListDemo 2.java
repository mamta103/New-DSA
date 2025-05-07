package sapient;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = Arrays.asList(4,6);
        List nums = list;
        nums.add(3.14);

    }
}
