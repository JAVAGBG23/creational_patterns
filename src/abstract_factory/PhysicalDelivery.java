package abstract_factory;

public class PhysicalDelivery implements DeliveryMethod{
    @Override
    public void ship() {
        System.out.println("Shipping product by courier!");
    }
}
