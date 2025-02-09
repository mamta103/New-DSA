package structure.design.pattern.proxydesignpattern;

public class ClientClass {
    public static void main(String[] args) {
        Subject proxy = new ProxyClass();

        proxy.method();
    }
}
