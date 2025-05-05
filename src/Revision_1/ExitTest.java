package Revision_1;

public class ExitTest {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            System.exit(0);
        }
        catch (Exception ex){
            System.out.println("Inside catch");
        }
        finally {
            System.out.println("Inside finally");
        }
    }
}
// Output:Inside try
