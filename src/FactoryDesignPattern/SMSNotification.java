package FactoryDesignPattern;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notification");

    }
}
