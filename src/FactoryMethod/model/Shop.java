package FactoryMethod.model;

public class Shop extends Website{
    @Override
    public void createPages() {
        pages.add(new ItemPage());
        pages.add(new SearchPage());
        pages.add(new CartPage());
    }
}
