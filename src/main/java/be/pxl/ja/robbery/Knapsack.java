package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private int maxCapacity;
    private List<Product> products = new ArrayList<>();

    public Knapsack(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentWeight() {
       return products.stream().mapToDouble(Product::getWeight).sum();
    }

    public void add(Product product) throws KnapsackFullException{
        if (getCurrentWeight() + product.getWeight() > maxCapacity) {
            throw new KnapsackFullException("Product " + product.getName() + " past niet in de knapsack.");
        }
        products.add(product);
    }

    public List<Product> getItems() {
        return products;
    }

}
