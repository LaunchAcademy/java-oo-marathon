public class Car extends Automobile {
  private int capacity;
  private int numPassengers;

  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers) {
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
//    this.engineRunning = false;
//    this is the better option
    this.toggleEngine();
  }

  public int getCapacity() {
    return this.capacity;
  }

  public int getNumPassengers() {
    return this.numPassengers;
  }

  public boolean addPassengers(int newPassengers) {
//    if(this.capacity == this.numPassengers)
//      5                  4
//    int newNumPassengers = this.numPassengers + newPassengers;
//    if(newNumPassengers > this.capacity)
    if (this.capacity-this.numPassengers < newPassengers) {
      return false;
    } else {
      this.numPassengers += newPassengers;
      return true;
    }
  }

  public void exitPassengers(int removePassengers) {
    // if we're trying to remove more passengers than are already in the car
    if(removePassengers > this.numPassengers) {
      // set number of passengers to 0
      this.numPassengers = 0;
    } else {
      this.numPassengers -= removePassengers;
    }
//    return true;
  }
}
