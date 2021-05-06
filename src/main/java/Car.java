public class Car extends Automobile {
    private int capacity;
    private int numPassengers;

    public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers) {
        super(type, model, make, mpg, fuelCapacity);
        this.toggleEngine();
        this.capacity = capacity;
        this.numPassengers = numPassengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public boolean addPassengers(int passengersToAdd){

        if(numPassengers + passengersToAdd > capacity){
            return false;
        }
        numPassengers += passengersToAdd;
        return true;
    }

    public void exitPassengers(int passengersToExit){
        if(passengersToExit < numPassengers){
            numPassengers -= passengersToExit;
        }else{
            numPassengers = 0;
        }

    }
}
