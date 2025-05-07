package PrivateMethodInterface;

interface Calculator {
    // Default method using a private method
    default void showSquare(int num) {
        System.out.println("Square of " + num + " is: " + square(num));
    }

    // Static method using a private method
     static void showCube(int num) {
        System.out.println("Cube of " + num + " is: " + cube(num));
    }

    // ✅ Private method (Only accessible within the interface)
    private int square(int num) {
        return num * num;
    }

    // ✅ Private static method (For static methods in the interface)
    private  static  int cube(int num) {
        return num * num * num;
    }
}
// Implementing the interface
class MathOperations implements Calculator{
    // No need to override anything, as default methods are inherited.

}
public class MainPrivateInterfaceMethod {
    public static void main(String[] args) {
        Calculator calculator = new MathOperations();
        calculator.showSquare(5);// Calls the default method

        // Static method call (directly from interface)
        Calculator.showCube(5);
    }
}
