package staticoverrride;

public class TestStatic {
    public static void test(){
        System.out.println("Test ");
    }
    public static void main(String[] args) {
        TestStatic testStatic = null;
        testStatic.test();
    }
}
