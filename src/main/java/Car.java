public class Car extends Automobile {
  private int capacity;
  private int numPassengers;
  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers) {
    super(type, model, make, mpg, fuelCapacity);
    // this.running will be Automobile default true
    toggleEngine(); // use method to toggle to false
    this.capacity = capacity;
    this.numPassengers = numPassengers;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

  public boolean addPassengers(int newPassengers) {
    if (capacity >= newPassengers + numPassengers) {
      numPassengers += newPassengers;
      return true;
    } else {
      return false;
    }
  }

  public void exitPassengers(int exitingPassengers) {
    if (numPassengers > exitingPassengers ) {
      int currentPassengers = numPassengers - exitingPassengers;
      numPassengers = currentPassengers;
      if (currentPassengers < 0) {
        numPassengers = 0;
      }
    } else {
      numPassengers = 0;
    }
  }
}
