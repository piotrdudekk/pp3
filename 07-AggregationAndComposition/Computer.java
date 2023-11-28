public class Computer {
    private boolean isOn;
    private int ram;
    private String os;
    private int storage;
    private Processor processor;

    public Computer(boolean isOn, int ram, String os, int storage){
        processor = new Processor("Ryzen", "5", 5600, 6);
        this.isOn = isOn;
        this.ram = ram;
        this.os = os;
        this.storage = storage;
    }

    public Processor getProcessor(){
        return processor;
    }

    public int getRam(){
        return ram;
    }

    public String getOs(){
        return os;
    }

    public int getStorage(){
        return storage;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public  String showStatus(){
        if (isOn == true){
            return "Computer is on.";
        }
        else {
            return "Computer is off.";
        }
    }

    public String toString(){
        return "Computer RAM: " + getRam() + "\n" + "Computer OS: " + getOs() + "\n" + "Computer storage: " + getStorage();
    }

    public static void main (String[] args){
        Computer computer = new Computer(true, 16, "Windows", 256);
        Processor processor = computer.getProcessor();

        System.out.println(processor.toString());
    }

}
