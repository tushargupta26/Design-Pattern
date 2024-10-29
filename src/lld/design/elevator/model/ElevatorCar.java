package lld.design.elevator.model;

public class ElevatorCar {

    int id;
    InternalButton internalButton;
    ElevatorDisplay display;
    ElevatorState elevatorState;
    int currentFloor;
    Direction direction;
    ElevatorDoor door;

    public ElevatorCar(){
        display = new ElevatorDisplay();
        internalButton = new InternalButton();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        direction = Direction.UP;
        door = new ElevatorDoor();

    }
    public void showDisplay() {
        display.showDisplay();
    }

    public void pressButton(int destination) {
        internalButton.pressButton(destination, this);
    }

    public void setDisplay() {
        this.display.setDisplay(currentFloor, direction);
    }

    boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = currentFloor;
        if(dir == Direction.UP) {
            for(int i = startFloor; i<=destinationFloor; i++) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }

        if(dir == Direction.DOWN) {
            for(int i = startFloor; i>=destinationFloor; i--) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }

}
