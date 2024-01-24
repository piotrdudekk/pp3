public class Bus extends Vehicle {
    private int seats;

    public Bus(String model, int wheels, int seats) {
        super(model, wheels);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String displayInfo() {
        return "Bus model: " + getModel() + ", " + getWheels() + " wheels, seats: " + seats;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Volvo C70", 4, 2.4);
        Truck t1 = new Truck("Scania 850", 6, 40000);
        t1.load();
        Bus b1 = new Bus("Setra 2000", 8, 56);

        System.out.println(c1.displayInfo());
        System.out.println(t1.displayInfo());
        System.out.println(b1.displayInfo());
    }
}
