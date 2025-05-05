import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //Input: strs = ["eat","tea","tan","ate","nat","bat"]
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<String> input = new ArrayList<>(List.of("eat","tea","tan","ate","nat","bat"));
        System.out.println(groupAnnagram(input));

    }

    private static List<List<String>> groupAnnagram(List<String> input) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String word:input){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            groups.computeIfAbsent(sorted,k->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groups.values());

    }
}
