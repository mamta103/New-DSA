package MapToIntExample;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyDemo {
    public static void main(String[] args) {
        String input = "aabbbcccc";

      Map<Character,Long> re=  input.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(re);
    }
}
