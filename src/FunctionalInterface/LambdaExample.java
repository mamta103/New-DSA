package FunctionalInterface;

public class LambdaExample {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = ()-> System.out.println("Executing existing method");
        myFunctionalInterface.existingMethod();
        myFunctionalInterface.newMethod();
        myFunctionalInterface.newMethod2();


        MyFunctionalInterface.newStaticMethod();
    }
}
