package InterfaceStaticMethod;

import java.util.Map;

interface MathUtils {
    // Static method in an interface
    static int add(int a, int b) {

        return a + b;
    }
}
class Calculator implements MathUtils{

}
public class StaticMethodInterface {
    public static void main(String[] args) {
        // Calling the static method using the interface name
        int result = MathUtils.add(2,3);
        System.out.println(result);
    }
}
