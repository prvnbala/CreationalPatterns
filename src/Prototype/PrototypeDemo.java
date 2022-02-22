package Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Book physics = (Book) registry.createItem("Book");
        physics.setTitle("Physics for Beginners");

        System.out.println(physics);
    }
}
