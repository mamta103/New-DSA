package DataStructure.arrayAdt;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }
        display(array);

    }

    private static void display(int[] array) {
        for (int i: array)
            System.out.println(i);
    }
}
