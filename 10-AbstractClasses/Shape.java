import java.lang.Math;

public abstract class Shape {
    private static final double pi = Math.PI;

    public double getPi() {
        return pi;
    }

    public abstract double area();

    public abstract double perimeter();

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5, 4);
        System.out.println("Triangle 1:  a=" + t1.getA() + ", b=" + t1.getB() + ", c=" + t1.getC() +
                ", h=" + t1.getH() + ", area=" + t1.area() + ", perimeter=" + t1.perimeter());

        Rectangle r1 = new Rectangle(4, 5);
        System.out.println("Rectangle 1:  a=" + r1.getA() + ", b=" + r1.getB() + ", area=" + r1.area() +
                ", perimeter=" + r1.perimeter());

        Circle c1 = new Circle(3);
        System.out.println("Circle 1:  r=" + c1.getR() + ", area=" + c1.area() + ", perimeter=" + c1.perimeter());
    }

}
