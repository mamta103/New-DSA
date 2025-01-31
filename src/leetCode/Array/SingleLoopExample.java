package leetCode.Array;

public class SingleLoopExample {
    public static void main(String[] args) {
        int[] nums = {2,71,11,7};

        int target = 9;
        sumTo(nums, target);
    }

    private static void sumTo(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]+nums[i+1] == target){
                System.out.println("target Matched"+ nums[i]+ ", "+nums[i+1]);
                break;
            }
        }
    }
}
