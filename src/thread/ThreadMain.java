package thread;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadExtends threadExtends = new ThreadExtends();
        threadExtends.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread is running...");
        }

    }
}
