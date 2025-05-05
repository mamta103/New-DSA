package java100codes;

public class SwapNumbersWithoutusingThirdVariable {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swapping: x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: x = " + x + ", y = " + y);

    }
}
//Output Before swapping: x = 10, y = 20
//After swapping: x = 20, y = 10
