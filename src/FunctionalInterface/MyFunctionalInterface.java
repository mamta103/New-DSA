package FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void existingMethod();// ✅ Functional interface method
//    void newAbstractMethod();

    static void newStaticMethod() { // ✅ Static method, no impact on lambdas
        System.out.println("New static method");
    }

    default void newMethod()// ✅ Safe: No impact on existing implementations
    {
        System.out.println("New default method implementation");

    }
    default void newMethod2(){
        System.out.println("New newMethod2  implementation");

    }
}
