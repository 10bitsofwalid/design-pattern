package FactoryDP3;

public class Main {
    public static void main(String[] args) {
        // Create an SMS notification using the factory method
        Notification smsNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.SMS);
        smsNotification.send(); // Outputs: Sending SMS Notification.

        // Create an Email notification using the factory method
        Notification emailNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.EMAIL);
        emailNotification.send(); // Outputs: Sending Email Notification.

        // TODO: Test the factory with an unsupported notification type
        Notification unsupportedNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.PUSH);
        unsupportedNotification.send(); // Should output: Unsupported Notification Type.
    }
}