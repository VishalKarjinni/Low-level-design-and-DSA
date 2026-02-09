package creational_pattern.factory;

import creational_pattern.factory.product.NotificationCreator;
import creational_pattern.factory.productCreator.EmailNotificationCreator;
import creational_pattern.factory.productCreator.PushNotificationCreator;
import creational_pattern.factory.productCreator.SMSNotificationCreator;

public class FactoryMain {
    public static void main(String[] args) {
        NotificationCreator notificationCreator;
        notificationCreator = new EmailNotificationCreator();
        notificationCreator.send("Welcome to our platform");

        notificationCreator = new SMSNotificationCreator();
        notificationCreator.send("Welcome to our platform");

        notificationCreator = new PushNotificationCreator();
        notificationCreator.send("Welcome to our platform");
    }
}
