package factory;

public class PhysicalProduct implements Product{
    @Override
    public void deliver() {
        System.out.println("Delivering product by shipping!");
    }
}
