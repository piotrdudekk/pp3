public class Car extends Vehicle {
    private double engine;

    public Car(String model, int wheels, double engine) {
        super(model, wheels);
        this.engine = engine;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double to100() {
        if (engine < 2.0) {
            return 12;
        } else if (engine > 2.0 && engine < 3.5) {
            return 7;
        } else {
            return 4;
        }
    }

    public String displayInfo() {
        return "Car model: " + getModel() + ", " + getWheels() + " wheels, engine: " + engine + ", 0-100km/h: "
                + to100();
    }
}
