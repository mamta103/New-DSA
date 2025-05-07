package joining;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//
//Output: [1,3,12,0,0]
//
public class SampleDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};//output: [1,3,12,0,0]
        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num; //loop int
            }//1,3,12
        }// no non zero will display

        System.out.println("nums:: "+nums.length);
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        while (insertPos < nums.length)//0<5
        {
            nums[insertPos++] = 0;
        }
//        now will display
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }
}
