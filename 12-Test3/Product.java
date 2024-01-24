import java.util.Arrays;

public class Product implements Comparable<Product> {

    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Float.compare(otherProduct.getPrice(), this.getPrice());
    }

    public static void main(String[] args) {
        Product[] arr = {
                new Product("milk", 5),
                new Product("cheese", 2),
                new Product("ham", 9)
        };

        System.out.println("Before sorting:");
        for (Product product : arr) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }

        Arrays.sort(arr);

        System.out.println("\nAfter sorting:");
        for (Product product : arr) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }
    }
}