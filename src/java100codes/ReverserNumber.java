package java100codes;

public class ReverserNumber {
    public static void main(String[] args) {
        int input = 3456;
        System.out.println(numberReverseFunc(input));


    }

    private static int numberReverseFunc(int input) {
        int reverse = 0 ;
        while(input > 0){
            int digit = input % 10;
            reverse = 10 * reverse+digit;
            input = input/10;
        }
        return reverse;
    }
}
