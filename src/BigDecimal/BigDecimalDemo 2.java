package BigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal("10.25");
        BigDecimal tax = new BigDecimal("0.10");

        BigDecimal total = price.multiply(tax).add(price);
        System.out.println("Total: " + total);
    }
}
