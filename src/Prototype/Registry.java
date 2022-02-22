package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setRuntime(100);
        movie.setTitle("Beast");
        movie.setPrice(150.0);
        items.put("Movie", movie);

        Book book = new Book();
        book.setNoOfPages(120);
        book.setTitle("Cool");
        book.setPrice(100);
        items.put("Book", book);
    }
}
