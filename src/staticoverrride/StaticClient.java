package staticoverrride;

public class StaticClient {
    public static void main(String[] args) {
        Parent p = new Child();
        Parent.display();
    }
}
