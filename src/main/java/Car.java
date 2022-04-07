public class Car extends Automobile {

  private int capacity;
  private int numPassengers;


  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity,
      int numPassengers) {
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
    toggleEngine();
  }

  public int getCapacity() {
    return capacity;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

  public boolean addPassengers(int newPassengers) {
    if (numPassengers + newPassengers > capacity) {
      return false;
    }
    numPassengers += newPassengers;
    return true;
  }

  public void exitPassengers(int exitingPassengers) {
    if (numPassengers - exitingPassengers < 0) {
      numPassengers = 0;
    } else {
      numPassengers = numPassengers - exitingPassengers;
    }
    // numPassengers = Math.max(numPassengers - exitingPassengers, 0);
  }
}
