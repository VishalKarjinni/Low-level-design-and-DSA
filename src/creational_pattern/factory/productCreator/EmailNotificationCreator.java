package creational_pattern.factory.productCreator;

import creational_pattern.factory.concrete.EmailNotification;
import creational_pattern.factory.factoryMethod.Notification;
import creational_pattern.factory.product.NotificationCreator;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
