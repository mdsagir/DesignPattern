package creational.factory.method;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notifying email notification...");
    }
}
