/* Superclass representing any item sold by the bakery. */
class Bakery {
    private String flavor;
    private double price;

    /* No-argument constructor. Sets default flavor and price. */
    public Bakery() {
        this("plain", 0.5);
    }

    /* Parameterized constructor that sets only the flavor. The price defaults to 0.5. */
    public Bakery(String flavor) {
        this(flavor, 0.5);
    }

    /* Parameterized constructor that sets flavor and price. Uses the mutator so the price is correct. */
    public Bakery(String flavor, double price) {
        this.flavor = flavor;
        setPrice(price);
    }

    /* Accessor for flavor and return the flavor. */
    public String getFlavor() { return flavor; }
    
    /* Accessor for price and returns price. */
    public double getPrice() { return price; }

    /* Mutator for flavor. */
    public void setFlavor(String flavor) { this.flavor = flavor; }

    /* Mutator for price. Negative prices are stored as 0.0. */
    public void setPrice(double price) {
        if (price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    /* Returns the state of this object as a String. */
    public String toString() {
        return "Flavor: " + flavor + ", Price: $" + price;
    }
}