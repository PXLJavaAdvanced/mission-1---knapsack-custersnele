package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> items = new ArrayList<>();

    public void add(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }


}
