package abstract_factory;

import factory.Product;

public class Main {
    public static void main(String[] args) {
        ProductFactory physicalFactory = new PhysicalProductFactory();
        Product physicalProduct = physicalFactory.createProduct();
    }
}
