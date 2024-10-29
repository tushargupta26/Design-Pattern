package lld.behavioualPattern.ObserverDesignPattern.Observable;

import lld.behavioualPattern.ObserverDesignPattern.Observer.NotificationObserver;

public interface StockObservable {

    public void add(NotificationObserver notificationObserver);

    public void remove(NotificationObserver notificationObserver);

    public void notifySubscribers();

    public void setStockCount(int newStockCount);

    public int getStockCount();
}
