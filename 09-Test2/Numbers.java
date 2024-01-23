public class Numbers {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public Numbers(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public boolean different() {
        boolean d = true;
        int[] arr = { this.a, this.b, this.c, this.d, this.e };
        for (int i = 0; i < 5; i++) {
            int c = 0;
            int n = arr[i];
            for (int j = 0; j < 5; j++) {
                if (arr[j] == n) {
                    c++;
                }
            }
            if (c > 1) {
                d = false;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(1, 2, 3, 4, 5);
        Numbers n2 = new Numbers(1, 2, 3, 4, 1);

        System.out.println(n1.different());
        System.out.println(n2.different());
    }

}
