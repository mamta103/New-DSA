//package UnmodifiableListExample;
//
//import java.util.*;
//
//public class UnmodifiableListExample {
//    public static void main(String[] args) {
//        List<String> originalList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
//
//        System.out.println("originalList :" + originalList);
//        // Creating an unmodifiable list
//        List<String> unmodifiableList = Collections.unmodifiableList(originalList);
//        System.out.println("unmodifiableList: " + unmodifiableList);
//        // Attempting to modify will throw UnsupportedOperationException
//
////        List<String > safeList = new ArrayList<>(unmodifiableList);
////        safeList.add("Straberry");
//
//        try {
//            unmodifiableList.add("Apple");
//        } catch (UnsupportedOperationException ex) {
//            System.out.println("Modification not allowed on an unmodifiable list.");
//
//        }
//    }
//}
