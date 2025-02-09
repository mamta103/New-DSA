package search;

public class LinerSearch {
    public static void main(String[] args) {
        // Step 1: Define the array to be searched
        int[] arr = {11, 3, 4, 5, 6, 45, 67, 15, 69};

        // Step 2: Define the search key (value to be searched)
        int searchKey = 153;

        // Step 3: Call the linearSearch method to find the search key in the array
        int result = linearSearch(arr, searchKey);

        // Step 4: Check the result and print the appropriate message
        if (result == -1) {
            System.out.println("Key value " + searchKey + " is not found in the array.");
        } else {
            System.out.println("Key value " + searchKey + " is found at index: " + result);
        }
    }

    /**
     * Performs a linear search on the given array to find the search key.
     *
     * @param arr       The array to be searched.
     * @param searchKey The value to be searched in the array.
     * @return The index of the search key if found; otherwise, returns -1.
     */
    private static int linearSearch(int[] arr, int searchKey) {
        // Iterate through the array
        for (int index = 0; index < arr.length; index++) {
            // Check if the current element matches the search key
            if (arr[index] == searchKey) {
                return index; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found in the array
    }
}