package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("p1", 12.5, 8.5));
        products.add(new Product("p2", 8.5, 8.5));
        products.add(new Product("p3", 4.5, 8.5));
        products.add(new Product("p4", 17.5, 8.5));
        products.add(new Product("p5", 11.5, 8.5));
        Collections.sort(products);
        for (Product p: products) {
            System.out.println(p);
        }
    }
}
