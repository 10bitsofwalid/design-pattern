package FactoryDP3;

public class NotificationFactory {
    // Enum to define supported notification types
    public enum NotificationType {
        SMS, EMAIL, PUSH
    }

    // Factory method to create notifications based on the type
    // TODO: Modify this method to handle unsupported types gracefully using NullNotification
    public static Notification getNotification(NotificationType type) {
        switch (type) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                // TODO: Return a NullNotification instead of throwing an exception
                return new NullNotification();
        }
    }
}
