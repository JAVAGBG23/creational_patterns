package factory;

public class Main {
    public static void main(String[] args) {
        Product physicalProduct = ProductFactory.getProduct("PHYSICAL");
        physicalProduct.deliver();

        Product digitalProduct = ProductFactory.getProduct("DIGITAL");
        digitalProduct.deliver();
    }
}
