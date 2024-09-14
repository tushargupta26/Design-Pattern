package behavioualPattern.commandPattern;

public class TurnOffAc implements ICommand{
    AirConditioner ac;

    TurnOffAc(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAc();
    }

    @Override
    public void undo() {
        ac.turnOnAc();
    }
}
