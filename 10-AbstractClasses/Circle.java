import java.lang.Math;

public class Circle extends Shape {
    private int r;
    private double pi = Math.PI;

    public double area() {
        double ar = pi * r * r;
        if ((ar * 100) % 1 == 0) {
            return ar;
        } else if ((ar * 100) % 1 >= 0.5) {
            return ar - (ar % 0.01) + 0.01;
        } else
            return ar - (ar % 0.01);
    }

    public double perimeter() {
        double per = 2 * pi * r;
        if ((per * 100) % 1 == 0) {
            return per;
        } else if ((per * 100) % 1 >= 0.5) {
            return per - (per % 0.01) + 0.01;
        } else
            return per - (per % 0.01);
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getPi() {
        return pi;
    }

}
