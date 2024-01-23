public class SuperCounter extends Counter {

    public SuperCounter(int counter) {
        super(counter);
    }

    public void addN(int n) {
        for (int i = 0; i < n; i++) {
            add1();
        }
    }

    public static void main(String[] args) {
        SuperCounter sc1 = new SuperCounter(0);
        sc1.add1();
        sc1.addN(10);
        System.out.println(sc1.getCounter());
    }
}
