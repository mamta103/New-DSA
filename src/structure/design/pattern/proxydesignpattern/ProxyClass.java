package structure.design.pattern.proxydesignpattern;

public class ProxyClass extends RealSubjectClass {

    @Override
    public void method() {
        System.out.println("Hi I am the proxy class which i wil  check autheticaticion and security check.");


        System.out.println("calling the real method of real class after the call of autheticaticion and security check.");


        super.method();
    }
}
