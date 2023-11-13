public class Counter {
    int c=0;

    public Counter(){}

    public void addOne(){
        c = c + 1;
    }

    public void minusOne(){
        c = c - 1;
    }

    public void addTen(){
        c = c + 10;
    }

    public void minusTen(){
        c = c - 10;
    }

    public void resetCounter(){
        c = 0;
    }

    public static void main (String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        
        for (int i=0; i<=1; i++){c1.addTen();}
        for (int i = 0; i<=2; i++){c1.addOne();}
        
        for (int i=0; i<=4; i++){c2.minusTen();}
        for (int i=0; i<=2; i++){c2.addOne();}

        System.out.println(c1.c);
        System.out.println(c2.c);
    }
}
