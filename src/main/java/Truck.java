public class Truck extends Automobile{
    private int bedLengthFeet;
    private int bedWidthFeet;
    private int containerHeightFeet;
    private int currentLoadCubicFeet = 0;

    public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet) {
        super(type, model, make, mpg, fuelCapacity);
        this.toggleEngine();
        this.bedLengthFeet = bedLengthFeet;
        this.bedWidthFeet = bedWidthFeet;
        this.containerHeightFeet = 3;
    }

    public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet, int containerHeightFeet) {
        super(type, model, make, mpg, fuelCapacity);
        this.toggleEngine();
        this.bedLengthFeet = bedLengthFeet;
        this.bedWidthFeet = bedWidthFeet;
        this.containerHeightFeet = containerHeightFeet;
    }

    public int getBedLengthFeet() {
        return bedLengthFeet;
    }

    public int getBedWidthFeet() {
        return bedWidthFeet;
    }

    public int getContainerHeightFeet() {
        return containerHeightFeet;
    }

    public int getCurrentLoadCubicFeet() {
        return currentLoadCubicFeet;
    }

    public int volumeCapacity(){
        return bedLengthFeet * bedWidthFeet * containerHeightFeet;
    }

    public boolean addCargo(int cargoVolume) {
        if(cargoVolume + currentLoadCubicFeet > volumeCapacity()){
            return false;
        }else{
            currentLoadCubicFeet += cargoVolume;
            return true;
        }
    }

    public void emptyCargo() {
        currentLoadCubicFeet = 0;
    }
}
