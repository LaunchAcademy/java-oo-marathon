public class Automobile {
    private String type;
    private String model;
    private String make;
    private int mpg;
    private int fuelCapacity;
    private boolean running;
    private boolean inService;

    public Automobile(String type, String model, String make, int mpg, int fuelCapacity) {
        this.type = type;
        this.model = model;
        this.make = make;
        this.mpg = mpg;
        this.fuelCapacity = fuelCapacity;
        this.running = true;
        this.inService = true;
    }

    public void toggleEngine() {
        this.running = !this.running;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }

    public int getMpg() {
        return this.mpg;
    }

    public int getFuelCapacity() {
        return this.fuelCapacity;
    }

    public boolean isRunning() {
        return this.running;
    }

    public boolean isInService(boolean b){
        return this.inService;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }

    public void repair(){
        this.inService = true;
    }
}
