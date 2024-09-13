package factory;

public class ProductFactory {
    public static Product getProduct(String productType) {
        if (productType == null) {
            return null;
        }
        if (productType.equalsIgnoreCase("PHYSICAL")) {
            return new PhysicalProduct();
        } else if (productType.equalsIgnoreCase("DIGITAL")) {
            return new DigitalProduct();
        }
        return null;
    }
}
