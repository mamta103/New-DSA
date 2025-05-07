package java100codes;

public class FactorialDemo {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(factorialFunction(num));
    }

    private static int factorialFunction(int num) {
        int fact = 1;
        if (num <= 1)
            return 1;
        else {
            return num * factorialFunction(num - 1);
        }
    }
}
