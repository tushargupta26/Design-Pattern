package behavioualPattern.commandPattern;

public class Main {

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();

        MyRemoteControl remoteControl = new MyRemoteControl();

        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.pressButtion();
        remoteControl.undo();
    }
}
