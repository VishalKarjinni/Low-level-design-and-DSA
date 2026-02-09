package behavioral_design_pattern.observerPattern.observable;

import behavioral_design_pattern.observerPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver Observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
