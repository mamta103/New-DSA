package sapient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring", "microservices");
        List<String> upperCaseNames  = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("upperCaseNames : "+ upperCaseNames);
    }
}
