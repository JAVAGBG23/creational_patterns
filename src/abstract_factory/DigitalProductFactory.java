package abstract_factory;

import factory.DigitalProduct;
import factory.Product;

public class DigitalProductFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new DigitalProduct();
    }

    @Override
    public DeliveryMethod deliveryMethod() {
        return new DigitalDelivery();
    }
}
