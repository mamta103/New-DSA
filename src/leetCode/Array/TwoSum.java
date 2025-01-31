package leetCode.Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,9,10,1,30};
        int target = 40;
     int[] result = toSum(nums, target);
     for (int output: result){
         System.out.println(output);
     }
    }

    private static int[] toSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target == nums[i]+nums[j]){
                    return new int[]{i,j};

                }
            }
        }

        return new int[]{};
    }

}