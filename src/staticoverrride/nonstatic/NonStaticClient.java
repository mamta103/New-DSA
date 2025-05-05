package staticoverrride.nonstatic;

public class NonStaticClient {
    public static void main(String[] args) {
        Parent1 p  = new Child1();
        p.display();
    }
}
