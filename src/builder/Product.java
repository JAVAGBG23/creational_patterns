package builder;

public class Product {
    private String name;
    private double price;
    private String description;
    private String category;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.category = builder.category;
    }

    public static class ProductBuilder {
        private String name;
        private double price;
        private String description;
        private String category;

        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Product build() {
            return new Product(this);
        }

        public String getDescription() {
            return description;
        }

        public ProductBuilder setDescription(String description) {
           this.description = description;
           return this;
        }

        public String getCategory() {
            return category;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }
    }

}
