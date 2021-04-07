public class Car extends Automobile {

    private int capacity;
    private int numPassengers;

    public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers) {
        super(type, model, make, mpg, fuelCapacity);
        this.capacity = capacity;
        this.numPassengers = numPassengers;
        this.setRunning(false);
        this.isInService(false);
        //this.toggleEngine();
        // this will set the car to the opposite of the parent class - which in this case satisfies the test
    }

    public void exitPassengers(int numExitingPassengers) {
        if (this.numPassengers - numExitingPassengers < 0) {
            this.numPassengers = 0;
        } else {
            this.numPassengers = this.numPassengers - numExitingPassengers;
        }
    }

    public boolean addPassengers(int numNewPassengers) {
        if (this.numPassengers + numNewPassengers <= this.capacity) {
            this.numPassengers += numNewPassengers;
            return true;
        }
        return false;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumPassengers() {
        return this.numPassengers;
    }

}



