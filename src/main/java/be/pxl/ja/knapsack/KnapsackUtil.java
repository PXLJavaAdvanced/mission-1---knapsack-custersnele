package be.pxl.ja.knapsack;

import be.pxl.ja.knapsack.Knapsack;
import be.pxl.ja.knapsack.KnapsackFullException;
import be.pxl.ja.knapsack.KnapsackItem;
import be.pxl.ja.knapsack.Pool;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {

    public static <T extends KnapsackItem & Comparable<T>> void fill(Knapsack<T> knapsack, Pool<T> pool) {
        List<T> items = pool.getItems();
        Collections.sort(items); // gesorteerd op prijs - duurste eerst
        for (T item : items) {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
