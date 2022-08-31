package creational.factory.method;

public class NotificationFactory {

    public static Notification createNotification(String channel) {

        if (channel.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }
        if (channel.equalsIgnoreCase("push")) {
            return new PushNotification();
        }
        return null;
    }
}
