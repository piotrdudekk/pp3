public class Rectangle extends Shape {
    private int a;
    private int b;

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
