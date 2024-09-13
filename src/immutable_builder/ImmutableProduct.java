package immutable_builder;

public final class ImmutableProduct {
    private final String name;
    private final double price;
    private final String description;
    private final String category;

    private ImmutableProduct(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.category = builder.category;
    }

    public static class ProductBuilder {
        private final String name;
        private final double price;
        private String description;
        private String category;

        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ImmutableProduct build() {
            return  new ImmutableProduct(this);
        }
    }
}
