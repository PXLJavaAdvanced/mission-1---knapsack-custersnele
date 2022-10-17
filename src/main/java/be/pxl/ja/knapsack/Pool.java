package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Pool<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }


}
