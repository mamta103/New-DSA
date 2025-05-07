package midum_01;

import java.util.Arrays;

public class LC01TwoSum {
    public static void main(String[] args) {
        Integer[] nums = {10, 5, 30, 20, 50};
        int target = 70;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    private static int[] twoSum(Integer[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }

        }
        return new int[]{};

    }
}
