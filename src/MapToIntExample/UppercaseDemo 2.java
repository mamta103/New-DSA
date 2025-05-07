package MapToIntExample;

import java.util.Arrays;
import java.util.List;

public class UppercaseDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring", "microservices");
        List<String>  result =names.stream().map(String::toUpperCase).toList();
        System.out.println(result);
    }
}
