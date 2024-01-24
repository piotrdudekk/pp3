public class Pizza extends Food implements Extra {
    private int size;

    public Pizza(String name, int size) {
        super(name);
        this.size = size;
    }

    public void setPrice() {
        setPrice(size - 10);
    }

    public float discount() {
        float disc = 0;
        if (size >= 30) {
            disc = (float) (getPrice() * 0.05);
        }
        return disc;
    }

    public float delivery() {
        float del = 6;
        if (size >= 50) {
            del = 8;
        }
        return del;
    }

    public float delivery(int tip) {
        float del = 6;
        if (size >= 50) {
            del = 8;
        }
        return (del + tip);
    }

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Caprese", 40);
        System.out.println("Pizza: " + p1.getName() + ", size: " + p1.size + ", price: " + p1.getPrice() + ", disc.: " +
                p1.discount() + ", delivery: " + p1.delivery());
    }

}
