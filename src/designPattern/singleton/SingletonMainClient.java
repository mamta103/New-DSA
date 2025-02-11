package designPattern.singleton;

public class SingletonMainClient {
    public static void main(String[] args) {
        SingletonClass singletonClass01 = SingletonClass.getSingletonInstance();
        singletonClass01.simpleMethod();

        SingletonClass singletonClass02= SingletonClass.getSingletonInstance();
        singletonClass02.simpleMethod();
    }
}
