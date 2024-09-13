package abstract_factory;

public class DigitalDelivery implements DeliveryMethod{
    @Override
    public void ship() {
        System.out.println("Delivering by email!");
    }
}
