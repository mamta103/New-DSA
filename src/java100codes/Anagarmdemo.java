package java100codes;

import java.util.*;
import java.util.stream.Collectors;

public class Anagarmdemo {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>(List.of("eat", "tea", "tan", "ate", "nat", "bat"));
        OptionalInt maxL = input.stream().mapToInt(String::length).max();
        System.out.println("maxL :" + maxL);

        List<String> toUpper = Collections.singletonList(input.stream().map(String::toUpperCase).collect(Collectors.joining(",")));
        System.out.println("toUpper :" + toUpper);
        Map<String, List<String>> groups = new HashMap<>();
        for (String word : input) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            groups.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        System.out.println(groups.values());
    }

}
