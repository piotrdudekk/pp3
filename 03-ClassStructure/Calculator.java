public class Calculator {
    static float biggerNumber(float a, float b){
        return Math.max(a,b);
    }
    
    static double piNumber(){
        return 22/7;
    }

    static float absoluteValue(float a){
        return Math.abs(a);
    }

    static double squareRoot(float a){
        return Math.sqrt(a);
    }

    static double randomNumber(double a, double b){
        return (double)(Math.random() * a * b);
    }

    static int randomIntNumber(int a, int b){
        return (int)(Math.random() * a * b);
    }

    static double Sine(int a){
        return Math.sin(a);
    }


    public static void main(String[] args){
        System.out.println(biggerNumber(34, 49));
        System.out.println(piNumber());
        System.out.println(absoluteValue(-17));
        System.out.println(squareRoot(9/2));
        System.out.println(randomNumber(0.1, 1.0));
        System.out.println(randomIntNumber(0, 10));
        System.out.println(Sine(90));
    }
}
