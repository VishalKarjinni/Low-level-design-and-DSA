package behavioral_design_pattern.observerPattern.observable;

import behavioral_design_pattern.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    int stockCounts = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObservers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObservers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
       for (NotificationAlertObserver notificationAlertObserver : notificationAlertObservers) {
           notificationAlertObserver.update();
       }
    }

    @Override
    public void setStockCount(int newStockAdded) {
       if (stockCounts == 0) {
           notifySubscribers();
       }
       stockCounts = stockCounts + newStockAdded;
    }

    @Override
    public int getStockCount() {
       return stockCounts;
    }
}
