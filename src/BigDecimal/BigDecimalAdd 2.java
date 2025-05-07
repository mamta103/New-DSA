package BigDecimal;

import java.math.BigDecimal;

public class BigDecimalAdd {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("11.11");
        BigDecimal bigDecimal2  =new BigDecimal("11.11");

        // Add two BigDecimal numbers
       BigDecimal bigDecimal = bigDecimal1.add(bigDecimal2);
        System.out.println("Sum of two BigDecimal numbers: " + bigDecimal);

        // Subtract two BigDecimal numbers
        BigDecimal bigDecimal3 = bigDecimal1.subtract(bigDecimal2);
        System.out.println("Subtraction of two BigDecimal numbers: " + bigDecimal3);

        // Multiply two BigDecimal numbers
        BigDecimal bigDecimal4 = bigDecimal1.multiply(bigDecimal2);
        System.out.println("Multiplication of two BigDecimal numbers: " + bigDecimal4);

        // Divide two BigDecimal numbers
        BigDecimal bigDecimal5 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Division of two BigDecimal numbers: " + bigDecimal5);
    }
}
