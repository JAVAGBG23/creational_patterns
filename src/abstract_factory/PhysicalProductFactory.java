package abstract_factory;

import factory.PhysicalProduct;
import factory.Product;

public class PhysicalProductFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new PhysicalProduct();
    }

    @Override
    public DeliveryMethod deliveryMethod() {
        return new PhysicalDelivery();
    }
}
