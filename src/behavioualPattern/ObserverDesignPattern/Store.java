package behavioualPattern.ObserverDesignPattern;

import behavioualPattern.ObserverDesignPattern.Observable.IphoneObservable;
import behavioualPattern.ObserverDesignPattern.Observable.StockObservable;
import behavioualPattern.ObserverDesignPattern.Observer.EmailObserver;
import behavioualPattern.ObserverDesignPattern.Observer.MobileAlertObserver;
import behavioualPattern.ObserverDesignPattern.Observer.NotificationObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        NotificationObserver observer = new EmailObserver("test@123");
        NotificationObserver observer1 = new EmailObserver("test@12345");
        NotificationObserver observer2 = new MobileAlertObserver("test");

        iphoneObservable.add(observer);
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStockCount(10);
        System.out.println(iphoneObservable.getStockCount());
        iphoneObservable.setStockCount(0);
        System.out.println(iphoneObservable.getStockCount());
        iphoneObservable.setStockCount(100);

    }
}
