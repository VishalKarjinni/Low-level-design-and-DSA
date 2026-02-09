package behavioral_design_pattern.observerPattern;

import behavioral_design_pattern.observerPattern.observable.IphoneObservableImpl;
import behavioral_design_pattern.observerPattern.observable.StocksObservable;
import behavioral_design_pattern.observerPattern.observer.EmailAlertObserverImpl;
import behavioral_design_pattern.observerPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
        NotificationAlertObserver notificationAlertObserver = new EmailAlertObserverImpl("Xyz1@email.com", iphoneStocksObservable);
        NotificationAlertObserver notificationAlertObserverOne = new EmailAlertObserverImpl("vishal@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver notificationAlertObserverTwo = new EmailAlertObserverImpl("youngsoft@gmail.com", iphoneStocksObservable);

        iphoneStocksObservable.add(notificationAlertObserver);
        iphoneStocksObservable.add(notificationAlertObserverOne);
        iphoneStocksObservable.add(notificationAlertObserverTwo);

        iphoneStocksObservable.setStockCount(10);
        iphoneStocksObservable.remove(notificationAlertObserver);
        iphoneStocksObservable.setStockCount(20);
        int stockCount = iphoneStocksObservable.getStockCount();
        System.out.println("Number of Stocks in Markets : " + stockCount);
    }
}
