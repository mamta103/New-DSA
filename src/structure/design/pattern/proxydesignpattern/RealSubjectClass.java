package structure.design.pattern.proxydesignpattern;

public class RealSubjectClass implements Subject {
    @Override
    public void method() {
        System.out.println("I am the actual real implementation of class rest of all are the my proxy. ");
    }
}
