package behavioral_design_pattern.observerPattern.observer;

import behavioral_design_pattern.observerPattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable Observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
       this.Observable = stocksObservable;
       this.emailId = emailId;
    }

    @Override
    public void update() {
       sendMail(emailId, "Product is in stock hurry up!");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("Mail sent to : " + emailId);
    }
}
