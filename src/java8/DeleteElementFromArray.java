package java8;

import java.util.Arrays;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int indexToDelete = 2; // Index of the element to delete (30 in this case)

        // Call the method to delete the element
        int[] newArray = deleteElement(originalArray, indexToDelete);
        // Print the new array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array after deletion: " + Arrays.toString(newArray));

    }

    private static int[] deleteElement(int[] originalArray, int indexToDelete) {
        // Create a new array with size one less than the original array
        int[] newArray = new int[originalArray.length - 1];

        if (indexToDelete < 0 ||  indexToDelete >= originalArray.length) {
            new IllegalArgumentException("Index is out of bounds");
        }
        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i != indexToDelete) {
                newArray[j++] = originalArray[i];
            }
        }

        return newArray;
    }
}
