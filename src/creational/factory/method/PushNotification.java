package creational.factory.method;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notifying push notification...");
    }
}
