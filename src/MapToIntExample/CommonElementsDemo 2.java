package MapToIntExample;
import java.util.Arrays;
import java.util.List;

public class CommonElementsDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(3, 7, 9, 11, 13);

        List<Integer> result =list1.stream().filter(list2::contains).toList();
        System.out.println(result);
    }
}
