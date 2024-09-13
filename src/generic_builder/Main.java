package generic_builder;

public class Main {
    public static void main(String[] args) {
        Product product = new GenericBuilder<>(Product::new)
                .with(Product::setName, "smartphone")
                .with(Product::setPrice, 200.00)
                .with(Product::setDescription, "phone")
                .with(Product::setCategory, "phone")
                .build();
    }
}
