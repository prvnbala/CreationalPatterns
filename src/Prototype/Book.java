package Prototype;

public class Book extends Item {
    private int noOfPages;

    public int getNoOfPages() {
        return noOfPages;
    }
    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "noOfPages=" + noOfPages +
                "} " + super.toString();
    }
}
