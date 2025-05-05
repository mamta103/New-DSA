package thread.synchronizeblock.classLock;

public class PrinterClassLockMain
{
    public static void main(String[] args) {
        PrinterClassLock printerClassLock = new PrinterClassLock();
        Runnable task = () -> printerClassLock.printDocuemnts("report.pdf");
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        thread1.start();
        thread2.start();
    }
}

