public class Range {
    
    static int numberOfItems(int x, int y){
        int c=0;
        for (int i=x; i<=y; i++){
            c++;
        }
        return c;
    }

    static int sumOfItems(int x, int y){
        int s=0;
        for (int i=x; i<=y; i++){
            s = s + i;
        }
        return s;
    }

    static int arithmeticMean(int x, int y){
        return (sumOfItems(x, y)/numberOfItems(x,y));
    }

    public static void main (String[] args){
        System.out.println("Items between 21 and 36: " + numberOfItems(21, 36));
        System.out.println("Sum of items between 21 and 36: " + sumOfItems(21, 36));
        System.out.println("Arithmetic mean of items between 21 and 36: " + arithmeticMean(21, 36));
    }
}
