public class Lamp {
    boolean isOn;

    void switchOff(){
        if (isOn==true){
            isOn = false;
        }
    }

    void switchOn(){
        if (isOn==false){
            isOn = true;
        }
    }

    String displayInfo(){
        return ("Lamp is ON: " + (isOn));
    }

    public static void main (String[]args){
        Lamp lamp1 = new Lamp();
        lamp1.switchOn();
        System.out.println(lamp1.displayInfo());
    }

}



