package products;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListProducts {

    private final Map<Product, Integer> products = new HashMap<>();

    public ListProducts(Map<Product, Integer> productMap) {

    }


    public void add(Product product, int quantity) {
        if (products.containsKey(product)) {
            throw new IllegalArgumentException("Такой продукт уже куплен");
        }
        products.put(product, quantity);

    }

    public void add(Product product) {
        add(product, 1);
    }


    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void remove(Product product) {
        if (!products.remove(product, 1)) {
            throw new IllegalArgumentException("Такого продукта нет");
        }


    }

    @Override
    public String toString() {
        return " " +
                " Состав: " + products +
                ' ';
    }

}

