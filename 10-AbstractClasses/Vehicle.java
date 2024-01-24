public abstract class Vehicle {
    private String model;
    private int wheels;

    public Vehicle(String model, int wheels) {
        this.model = model;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public abstract String displayInfo();
}
