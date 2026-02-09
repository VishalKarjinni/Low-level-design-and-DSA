package creational_pattern.factory.product;

import creational_pattern.factory.factoryMethod.Notification;

public abstract class NotificationCreator {
    //Factory Method
    public abstract Notification createNotification();

    //common logic using factory method
    public void send(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
