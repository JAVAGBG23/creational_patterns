package builder;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product.ProductBuilder("Laptop", 1200).build();

        Product product2 = new Product.ProductBuilder("Smartphone", 900)
                .setDescription("its a phone")
                .setCategory("Phones")
                .build();
    }
}
