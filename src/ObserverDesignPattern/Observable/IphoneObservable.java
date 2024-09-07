package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{

    public List<NotificationObserver> observerList = new ArrayList<>();
    public int count = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        observerList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        observerList.remove(notificationObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver notificationObserver: observerList)
            notificationObserver.update();
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(count == 0 && newStockCount > 0){
            notifySubscribers();
        }
        this.count = newStockCount;

    }

    @Override
    public int getStockCount() {
        return count;
    }
}
