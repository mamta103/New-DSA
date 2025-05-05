package Varargs;

class Logger {
    public static void log(String... messages) {
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}

public class LoggingUtility {
    public static void main(String[] args) {
        Logger.log("System started");
        Logger.log("User logged in", "File opened");
        System.out.println("==========");
        Logger.log();
    }
}
