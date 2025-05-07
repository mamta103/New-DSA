public class TestExit {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally block"); // ❌ Won’t be printed

        }
    }
}
