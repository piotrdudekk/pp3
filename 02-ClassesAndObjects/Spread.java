public class Spread {
    double buy;
    double sell;

    double spreadCalculator(){
        double sp = sell - buy;
        return sp;
    }

    public static void main (String[] args){
        Spread spr1 = new Spread();
        spr1.buy = 4.5940;
        spr1.sell = 4.6250;
        System.out.println("Bank buys EUR: " + spr1.buy);
        System.out.println("Bank sells EUR: " + spr1.sell);
        //System.out.format("%.4f%n", spr1.spreadCalculator());
        System.out.printf("Spread: " + "%5.4f%n", spr1.spreadCalculator());
    }
}
