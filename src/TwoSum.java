import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 17;
        List<Integer> result = twoSum(nums, target);
        System.out.println(result.stream().toList());
    }

    private static List<Integer> twoSum(List<Integer> nums, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result;
    }
}
