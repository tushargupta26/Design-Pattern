package lld.design.elevator.model;

import java.util.PriorityQueue;

public class ElevatorController {

    PriorityQueue<Integer> upMin;
    PriorityQueue<Integer> downMax;
    ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        upMin = new PriorityQueue<>();
        downMax = new PriorityQueue<>((a, b) -> b - a);
    }

    public void submitExternalRequest(Direction direction, int floor) {
        if(direction == Direction.DOWN){
            downMax.offer(floor);
        } else {
            upMin.offer(floor);
        }
    }

    public void submitInternalRequest(int floor){

    }

    public void controlElevator(){
        while(true) {

            if(elevatorCar.elevatorDirection == Direction.UP){


            }
        }
    }
}
