package designPattern.singleton;

public class Singleton {
    private Singleton singleton;

    private Singleton(){

    }

    private  Singleton getInstance(){
        if(singleton==null){
            return new Singleton();
        }
        return null;
    }
}
