package java8;
import java.util.Arrays; import java.util.List; import java.util.Optional; import java.util.stream.Collectors;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 9, 21, 18, 9, 12, 7);
        List<Integer> collectedList = numbers.stream().distinct().collect(Collectors.toList());
        long count = numbers.stream().count();
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        boolean anyMatch = numbers.stream().anyMatch(n -> n > 15);
        List<Integer> resultLimit = numbers.stream().filter(i-> i>10).limit(2).sorted().toList();
        List<Integer> resultSkip = numbers.stream().filter(i-> i>10).skip(1).toList();
        System.out.println("Collected List: " + collectedList);
        System.out.println("Count: " + count);
        System.out.println("Min: " + min.orElse(null));
        System.out.println("Max: " + max.orElse(null));
        System.out.println("Any number > 15? " + anyMatch);
        System.out.println("resultLimit :"+resultLimit);
        System.out.println("resultSkip : "+  resultSkip);

    }
}