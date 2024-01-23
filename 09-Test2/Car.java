public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int[] arr = { getSeats(), maxSpeed };
        return arr;
    }

    public static void main(String[] args) {
        Car volvo = new Car(4, 240);
        System.out.println(volvo.getSeats());
        System.out.println(volvo.getMaxSpeed());

        int[] cs = volvo.spec();
        System.out.println(cs[0] + ", " + cs[1]);
    }
}
