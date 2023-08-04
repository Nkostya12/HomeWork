public class Elevator {

    private int currentFloor = 1;
    private int maxFloor;

    private int minFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }


    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUP() {
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Incorrect floor");

        }
        if (currentFloor < floor){
            while (currentFloor != floor){
                currentFloor ++;
                System.out.println(currentFloor);

            }
        }else if(currentFloor > floor){
            while (currentFloor != floor){
                currentFloor --;
                System.out.println(currentFloor);

            }

        }

    }
}
