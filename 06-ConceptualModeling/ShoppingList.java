import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<String> products;

    public ShoppingList (){
        //this.products = products;
    }

    public ArrayList getProducts(){
        return products;
    }

    public void setProducts(ArrayList products){
        this.products = products;
    }

    public ArrayList displayProducts(){
        return getProducts();
    }

    public int displayNumberOfProducts(){
        return products.size();
    }

    public void addProduct(String product){
        products.add(product);
    }

    public static void main (String[] args){
        ShoppingList pro1 = new ShoppingList();
        System.out.println(pro1.displayProducts());
        System.out.println(pro1.displayNumberOfProducts());
        pro1.addProduct("cukier");
        System.out.println(pro1.displayProducts());
        System.out.println(pro1.displayNumberOfProducts());
    }
}

