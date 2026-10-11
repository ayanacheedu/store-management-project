/* Subclass of Bakery representing a cake. */
class Cake extends Bakery {
    private int layers;

    /* No-argument constructor. Defaults to a plain, single-layer cake. */
    public Cake() {
        this("plain", 0.5, 1);
    }

    /* Parameterized constructor for flavor and price. Layers defaults to 1. */
    public Cake(String flavor, double price) {
        this(flavor, price, 1);
    }

    /* Parameterized constructor for all fields. Calls the superclass constructor with super. */
    public Cake(String flavor, double price, int layers) {
        super(flavor, price);
        this.layers = layers;
    }

    /* Accessor for layers. Returns the number of layers */
    public int getLayers() { 
      return layers; 
    }

    /* Mutator for layers. A cake must have at least 1 layer. */
    public void setLayers(int layers) {
        if (layers < 1) {
            this.layers = 1;
        } else {
            this.layers = layers;
        }
    }

    /* Returns the state of this Cake, including the superclass toString(). */
    public String toString() {
        return "Cake -> " + super.toString() + ", Layers: " + layers;
    }
}