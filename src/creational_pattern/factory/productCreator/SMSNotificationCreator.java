package creational_pattern.factory.productCreator;

import creational_pattern.factory.concrete.SMSNotification;
import creational_pattern.factory.factoryMethod.Notification;
import creational_pattern.factory.product.NotificationCreator;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
