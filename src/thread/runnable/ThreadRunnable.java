package thread.runnable;

public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++) {
            System.out.println("Child Thread " + i);
        }
    }
}
