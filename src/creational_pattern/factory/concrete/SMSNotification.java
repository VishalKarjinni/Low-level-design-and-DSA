package creational_pattern.factory.concrete;

import creational_pattern.factory.factoryMethod.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending sms" + message);
    }
}
