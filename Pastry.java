/* Subclass of Bakery representing a pastry. */
class Pastry extends Bakery {
    private String type;

    /* No-argument constructor. Defaults to a plain, flaky pastry. */
    public Pastry() {
        this("plain", 0.5, "Flaky");
    }

    /* Parameterized constructor for flavor and price. Type defaults to "Flaky". */
    public Pastry(String flavor, double price) {
        this(flavor, price, "Flaky");
    }

    /* Parameterized constructor for all fields. Calls the superclass constructor with super. */
    public Pastry(String flavor, double price, String type) {
        super(flavor, price);
        this.type = type;
    }

    /* Accessor for type. Returns the pastry type. */
    public String getType() { 
      return type; 
    }

    /* Mutator for type. */
    public void setType(String type) { 
      this.type = type; 
    }

    /* Returns the state of this Pastry, including the superclass toString(). */
    public String toString() {
        return "Pastry -> " + super.toString() + ", Type: " + type;
    }
}