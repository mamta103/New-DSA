package lamdaDemo;

import java.util.function.BiConsumer;

public class LamdaDemo1 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(5, 5);

        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> System.out.println(a * b);
        biConsumer1.accept(10, 10);
    }
}
