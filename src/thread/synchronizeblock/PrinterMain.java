package thread.synchronizeblock;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Runnable task = ()-> printer.printDocuments("report.pfd");
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
    }
}

//Output
/*
Thread-1 started printing Report.pdf
Thread-1 finished printing Report.pdf
Thread-2 started printing Report.pdf
Thread-2 finished printing Report.pdf

 */