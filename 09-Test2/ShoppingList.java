import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> products = new ArrayList<Product>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        products.add(product);
    }

    /*
     * public String toString() {
     * String s = "";
     * for (Product p : products) {
     * s = s + p.getName() + ",";
     * }
     * s = s - ",";
     * return s;
     * }
     */

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            result.append(products.get(i).getName());
            if (i < products.size() - 1) {
                result.append(",");
            }
        }
        return result.toString();
    }

    public int total() {
        int c = 0;
        for (Product p : products) {
            c = c + p.getQuantity();
        }
        return c;
    }

    public static void main(String[] args) {
        Product p1 = new Product("milk", 2);
        Product p2 = new Product("apple", 4);
        ShoppingList s = new ShoppingList();

        s.add(p1);
        s.add(p2);
        System.out.println(s.toString());
        System.out.println(s.total());
    }

}
