package Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Sandwich.SandwichBuilder sandwichBuilder = new Sandwich.SandwichBuilder();
        sandwichBuilder
                .setBread("Wheat")
                .setFilling("Paneer")
                .setDressing("Garlic")
                .setCondiments("Mayo");

        Sandwich paneerGarlic = sandwichBuilder.build();
        System.out.println(paneerGarlic);

        sandwichBuilder.setFilling("Corn");
        Sandwich cornGarlic = sandwichBuilder.build();
        System.out.println(cornGarlic);
    }
}
