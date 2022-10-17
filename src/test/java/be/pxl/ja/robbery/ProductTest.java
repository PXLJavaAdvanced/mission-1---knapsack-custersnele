package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void twoProductsWithEqualPriceReturnZero() {
        Product product1 = new Product("Product 1", 12.5, 15.5);
        Product product2 = new Product("Product 2", 12.5, 20.25);
        Assertions.assertEquals(0, product1.compareTo(product2));
    }

    @Test
    public void twoProductsWithDifferentPrice() {
        Product product1 = new Product("Product 1", 25.6, 15.5);
        Product product2 = new Product("Product 2", 12.5, 20.25);
        Assertions.assertEquals(-1, product1.compareTo(product2));
        Assertions.assertEquals(1, product2.compareTo(product1));
    }


}
