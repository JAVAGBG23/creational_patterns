package immutable_builder;

public class Main {
    public static void main(String[] args) {
        ImmutableProduct p = new ImmutableProduct.ProductBuilder("tablet", 300).build();
    }
}
