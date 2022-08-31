package creational.factory.method;

public class Main {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification("email");
        Notification push = NotificationFactory.createNotification("push");
        email.notifyUser();
        push.notifyUser();
    }
}
