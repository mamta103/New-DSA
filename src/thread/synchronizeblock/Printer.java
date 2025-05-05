package thread.synchronizeblock;

public class Printer {
    public void printDocuments(String doc) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " started printing " + doc);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(Thread.currentThread().getName() + " finished printing " + doc);

            }
        }
    }
}
