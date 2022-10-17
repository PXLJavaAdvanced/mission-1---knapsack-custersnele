package be.pxl.ja.citytrip;

import be.pxl.ja.knapsack.Knapsack;
import be.pxl.ja.knapsack.Pool;
import be.pxl.ja.knapsack.KnapsackUtil;

public class VisitLondon {
    public static void main(String[] args) {
        Knapsack<Attraction> knapsack = new Knapsack<>(2);
        Pool<Attraction> attractions = new Pool<>();

        attractions.add(new Attraction("Westminster Abbey", 0.5, 7));
        attractions.add(new Attraction("Globe Theater", 0.5, 6));
        attractions.add(new Attraction("National Gallery", 1, 7));
        attractions.add(new Attraction("British Museum", 1.5, 9));
        attractions.add(new Attraction("St. Paul's Cathedral", 0.5, 8));

        KnapsackUtil.fill(knapsack, attractions);

        System.out.println("\nList of attractions:");
        for (Attraction attraction : knapsack.getItems()) {
            System.out.println(attraction);
        }
    }
}