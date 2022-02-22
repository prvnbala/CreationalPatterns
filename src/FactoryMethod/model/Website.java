package FactoryMethod.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createPages();

    public Website() {
        this.createPages();
    }
}
