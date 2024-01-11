public class Triangle extends Shape {
    private int a;
    private int h;
    private int b;
    private int c;

    public double area() {
        return (getA() * getH()) / 2;
    }

    public double perimeter() {
        return a + b + c;
    }

    public Triangle(int a, int h, int b, int c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

}
