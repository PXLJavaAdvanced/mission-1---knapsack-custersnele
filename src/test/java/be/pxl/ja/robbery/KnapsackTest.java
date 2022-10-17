package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnapsackTest {

    private Knapsack knapsackWithProducts;

    @BeforeEach
    public void init() throws KnapsackFullException{
        knapsackWithProducts = new Knapsack(35);
        knapsackWithProducts.add(new Product("p1", 12.5, 8.5));
        knapsackWithProducts.add(new Product("p2", 8.5, 5.5));
        knapsackWithProducts.add(new Product("p3", 15, 7.5));
    }

    @Test
    public void emptyKnapsackHasWeightZero() {
        Knapsack knapsack = new Knapsack(35);
        assertEquals(0, knapsack.getCurrentWeight());
    }

    @Test
    public void knapsackWithProductReturnsCorrectWeight() {
        assertEquals(21.5, knapsackWithProducts.getCurrentWeight());
    }

    @Test
    public void addProductToKnapsack() throws KnapsackFullException{
        int initialSize = knapsackWithProducts.getItems().size();
        double initialWeight = knapsackWithProducts.getCurrentWeight();
        knapsackWithProducts.add(new Product("p4", 25.3, 6.5));
        assertEquals(initialSize + 1, knapsackWithProducts.getItems().size());
        assertEquals(initialWeight + 6.5, knapsackWithProducts.getCurrentWeight());
    }


    @Test
    public void addProductThrowsKnapsackFullExceptionWhenCapacityExceeded() {
        Assertions.assertThrows(KnapsackFullException.class,
                () -> knapsackWithProducts.add(new Product("p5", 25.5, 30)));
    }
}
