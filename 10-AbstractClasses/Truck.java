public class Truck extends Vehicle {
    private int weight;
    boolean loaded;

    public Truck(String model, int wheels, int weight) {
        super(model, wheels);
        this.weight = weight;
        this.loaded = false;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    public void load() {
        loaded = true;
    }

    public String displayInfo() {
        return "Truck model: " + getModel() + ", " + getWheels() + " wheels, weight: " + weight + ", loaded: " + loaded;
    }
}
