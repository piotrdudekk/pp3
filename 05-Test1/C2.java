public class C2 {
    int c;

    public C2(){
        this.c = 0;
    }

    public void increase(){
        c = c + 1;
    }

    public void decrease(){
        c = c - 1;
    }

    public void increase(int n){
        c = c + n;
    }

    public void decrease(int n){
        c = c - n;
    }

    public int value(){
        return c;
    }

    public static void main (String[] args){
        C2 o = new C2();
        System.out.println(o.value());
        o.increase();
        o.increase();
        o.decrease();
        o.increase(5);
        o.decrease(2);
        System.out.println(o.value());

    }
}
