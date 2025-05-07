package joining;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningDemo1 {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Python", "C++");
        String result = list.stream().collect(Collectors.joining());
        System.out.println(result);
        String commaSeprator = list.stream().collect(Collectors.joining(",  "));
        System.out.println("commaSeprator ::"+ commaSeprator);
    }
}
