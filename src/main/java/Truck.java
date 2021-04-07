public class Truck extends Automobile {
    private int bedLengthFeet;
    private int bedWidthFeet;
    private int containerHeightFeet;
    private int currentLoadCubicFeet;

    public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet) {
        super(type, model, make, mpg, fuelCapacity);
        this.bedLengthFeet = bedLengthFeet;
        this.bedWidthFeet = bedWidthFeet;
        this.containerHeightFeet = 3;
        this.currentLoadCubicFeet = 0;
        this.setRunning(false);
        this.setInService(false);
    }

    public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet, int containerHeightFeet) {
        this(type, model, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
        this.containerHeightFeet = containerHeightFeet;
        this.currentLoadCubicFeet = 0;
        this.setRunning(false);
        this.setInService(false);
    }

    public int getBedLengthFeet() {
        return this.bedLengthFeet;
    }

    public int getBedWidthFeet() {
        return this.bedWidthFeet;
    }

    public int getContainerHeightFeet() {
        return this.containerHeightFeet;
    }

    public int getCurrentLoadCubicFeet() {
        return this.currentLoadCubicFeet;
    }

    public int volumeCapacity() {
        return getBedWidthFeet() * getBedLengthFeet() * getContainerHeightFeet();
    }

    public boolean addCargo(int cargoVolume) {
        if (this.getCurrentLoadCubicFeet() + cargoVolume <= this.volumeCapacity()) {
            this.currentLoadCubicFeet += cargoVolume;
            return true;
        }
        return false;
    }

    public void emptyCargo() {
        this.currentLoadCubicFeet = 0;
    }
}
