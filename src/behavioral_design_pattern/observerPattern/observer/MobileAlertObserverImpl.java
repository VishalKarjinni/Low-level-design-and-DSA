package behavioral_design_pattern.observerPattern.observer;

import behavioral_design_pattern.observerPattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String emailId;

    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable) {
        this.stocksObservable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
       sendMail( emailId ,  "product in stock hurry up!");
    }

    public void sendMail(String emailId, String msg) {
        System.out.println("Mail sent to be " + emailId);
    }
}
