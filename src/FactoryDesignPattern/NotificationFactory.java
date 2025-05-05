package FactoryDesignPattern;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty())
            return null;
        if ("EMAIL".equalsIgnoreCase(type))
            return new EmailNotification();
        if ("SMS".equalsIgnoreCase(type))
            return new SMSNotification();
        return null;
    }
}
