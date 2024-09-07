package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailObserver implements NotificationObserver{
    String emailId;
//    StockObservable observable;

    public EmailObserver(String emailId){
        this.emailId = emailId;
//        this.observable = stockObservable;
    }

    @Override
    public void update(){
        sendEmail(emailId, "product is in stock");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("Notifying email ID " + emailId + " " + msg);
    }
}
