package java8;

import java.util.ArrayList;
import java.util.List;

public class DeleteElementFromArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        int indexToDelete = 2; // Index of the element to delete (30 in this case)

        // Delete the element at the specified index
        list.remove(indexToDelete);

       // Print the updated list
        System.out.println("List after deletion: " + list);
    }
}
