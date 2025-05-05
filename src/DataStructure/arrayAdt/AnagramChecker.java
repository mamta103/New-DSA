package DataStructure.arrayAdt;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Step 1: Normalize both strings
        // - remove all white spaces
        // - convert to lowercase for case-insensitive comparison
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check if both strings are of the same length
        if (s1.length() != s2.length()) {
            System.out.println("Not anagrams (length mismatch).");
        } else {
            // Step 3: Convert strings to character arrays
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            // Step 4: Sort both character arrays
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // Step 5: Compare sorted arrays
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("Yes, the strings are anagrams.");
            } else {
                System.out.println("No, the strings are not anagrams.");
            }
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}