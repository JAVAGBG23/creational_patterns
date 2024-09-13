package abstract_factory;

import factory.Product;

public interface ProductFactory {
    Product createProduct();
    DeliveryMethod deliveryMethod();
}
