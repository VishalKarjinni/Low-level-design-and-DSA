package creational_pattern.factory.productCreator;

import creational_pattern.factory.concrete.PushNotification;
import creational_pattern.factory.factoryMethod.Notification;
import creational_pattern.factory.product.NotificationCreator;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
