public interface MyInterface {
    default void showA() {
        log("A");
    }

    default void showB() {
        log("B");
    }

    private void log(String msg) {
        System.out.println("Logging: " + msg);
    }


}
