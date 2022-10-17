package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<T extends KnapsackItem> {
    private int maxCapacity;
    private List<T> items = new ArrayList<>();

    public Knapsack(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentWeight() {
       return items.stream().mapToDouble(KnapsackItem::getWeight).sum();
    }

    public void add(T item) throws KnapsackFullException{
        if (getCurrentWeight() + item.getWeight() > maxCapacity) {
            throw new KnapsackFullException("Product " + item.getName() + " past niet in de knapsack.");
        }
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

}
