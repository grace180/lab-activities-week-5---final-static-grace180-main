package oop.lab.week5;

    public class Product {
        private final double Tax = 0.1;
        private final double Service = 0.15;
        private int id;
        private String name;
        private String description;
        private double price;

        public Product(int id, String name, String description, double price) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }

        public double getPriceWithTax() {
            return price * (1 + Tax);
        }

        public double getPriceWithService() {
            return price * (1 + Tax + Service);
        }
    }
}
