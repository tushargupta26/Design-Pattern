package lld.design.elevator.model;

public class InternalButton {

    InternalDispatcher internalDispatcher;

    int[] availableButtons = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int buttonSelected;

    void pressButton(int destination, ElevatorCar elevatorCar) {

        //1.check if destination is in the list of available floors

        //2.submit the request to the jobDispatcher
        internalDispatcher.submitInternalRequest(destination, elevatorCar);
    }

}
