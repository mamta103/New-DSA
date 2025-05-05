package thread.synchronizeblock.classLock;

public class PrinterClassLock {
    public synchronized void printDocuemnts(String doc) {
        System.out.println(Thread.currentThread().getName() + " started printing " + doc);
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " finished printing " + doc);
        }
    }
}
