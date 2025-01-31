package leetCode.Array;

public class StaticAndDynamicArray {
    public static void main(String[] args) {
        int[] staticArr = {1, 2, 3, 4, 5};
        int[] dynamicArray = new int[]{};
//        staticArr = null;
//        dynamicArray = null;

        dynamicArray =  staticArr ;
        staticArr  = null;
//        System.out.println("staticArr.length: "+staticArr.length);
        System.out.println("dynamicArray length :-"+ dynamicArray.length);
        for (int i:dynamicArray)
            System.out.println(i);

        return;
    }
}
