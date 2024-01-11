public class Computer {
    private boolean isOn;
    private int ram;
    private String os;
    private int storage;
    private Processor processor;

    public Computer(boolean isOn, int ram, String os, int storage, String make, String model, float frequency,
            int cacheSize) {
        this.processor = new Processor(make, model, frequency, cacheSize);
        this.isOn = isOn;
        this.ram = ram;
        this.os = os;
        this.storage = storage;
    }

    public Processor getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    public int getStorage() {
        return storage;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String showStatus() {
        if (isOn == true) {
            return "Computer is on.";
        } else {
            return "Computer is off.";
        }
    }

    public String toString() {
        return "Computer RAM: " + getRam() + "\n" + "Computer OS: " + getOs() + "\n" + "Computer storage: "
                + getStorage() + "\n Processor: " + getProcessor().toString();
    }

    public static void main(String[] args) {
        // Processor ryzen = new Processor("Ryzen", "GHX", 500, 6);
        Computer computer = new Computer(true, 16, "Windows", 256, "Ryzen", "GHX", 500, 6);
        // Processor processor = computer.getProcessor();

        System.out.println(computer.toString());
    }

}
