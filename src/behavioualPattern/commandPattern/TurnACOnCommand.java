package behavioualPattern.commandPattern;

public class TurnACOnCommand implements ICommand{

    AirConditioner ac;

    TurnACOnCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }

    @Override
    public void undo() {
        ac.turnOffAc();
    }
}
