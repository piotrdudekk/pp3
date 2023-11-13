public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String displayDim(){
        return ("Dimensions: " + a + "x" + b);
    }

    public int surfaceArea(){
        return a*b;
    }

    public static void main (String[] args){
        Rectangle rec1 = new Rectangle(3, 4);
        Rectangle rec2 = new Rectangle(2, 7);
        System.out.println("Rectangle 1:" + "\n" + rec1.displayDim() + "\nSurface Area: " + rec1.surfaceArea());
        System.out.println("\nRectangle 2:" + "\n" + rec2.displayDim() + "\nSurface Area: " + rec2.surfaceArea());
    }
}
