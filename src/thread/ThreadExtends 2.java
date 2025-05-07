package thread;

public class ThreadExtends extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Child Thread is Running...");

        }
    }
}
