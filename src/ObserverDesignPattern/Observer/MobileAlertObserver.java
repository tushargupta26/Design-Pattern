package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationObserver{

    String userName;

    public MobileAlertObserver(String user){
        this.userName = user;
//        this.observable = stockObservable;
    }

    @Override
    public void update(){
        sendEmail(userName, "product is in stock");
    }

    private void sendEmail(String userName, String msg) {
        System.out.println("Notifying user " + userName + " " + msg);
    }
}
