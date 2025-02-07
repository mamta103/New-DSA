package leetCode.Array;

public class InsertAtIndexArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 9, 12, 99};
        int index = 2;
        int value = 37;
        int[] newNums = new int[nums.length + 1];

        displayArray(newNums);
        inserArray(newNums, index, value);
//        for(int i=0; i<)

    }

    private static void inserArray(int[] newNums,int index,  int value) {
        for(int i=0, j=0;i< newNums.length; i++){
            if(i==index){
                newNums[i]=value;
            }else{
                newNums[i] = newNums[j++];
            }
        }
    }

    private static void displayArray(int[] nums) {
        for (int i : nums) {
            System.out.println("i :");
        }
    }

}

