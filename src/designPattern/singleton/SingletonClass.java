package designPattern.singleton;

public class SingletonClass {

    private static SingletonClass singletonInstance = new SingletonClass();

    private SingletonClass() {

    }

    //Get the object only available
    public static SingletonClass getSingletonInstance() {
        return singletonInstance;
    }

    public void simpleMethod() {
        System.out.println("hashcode of singleton object: " + singletonInstance);
    }
}
