package factory;

public class DigitalProduct implements Product{
    @Override
    public void deliver() {
        System.out.println("Delivering product by email!");
    }
}
