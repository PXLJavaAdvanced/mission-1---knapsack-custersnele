package be.pxl.ja.robbery;

import be.pxl.ja.knapsack.Knapsack;
import be.pxl.ja.knapsack.KnapsackFullException;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {

    public static void fill(Knapsack knapsack, Shop shop) {
        List<Product> items = shop.getItems();
        Collections.sort(items); // gesorteerd op prijs - duurste eerst
        for (Product item : items) {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
