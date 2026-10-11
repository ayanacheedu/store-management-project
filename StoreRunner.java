import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // Objects built with the no-argument and parameterized constructors
  Bakery generic = new Bakery("cinnamon", 1.25);
  Bread defaultBread = new Bread();
  Pastry sampleCroissant = new Pastry("butter", 3.50, "Croissant");
  Cake sampleCake = new Cake("chocolate", 20.0, 2);

  System.out.println("~~~ Menu Samples ~~~");
  System.out.println(generic);
  System.out.println(defaultBread);
  System.out.println(sampleCroissant);
  System.out.println(sampleCake);
  System.out.println();

  Bread b = new Bread();
  Pastry p = new Pastry();

  // Bread purchase
  System.out.print("Flavor: ");
  String flavor = input.nextLine();
  b.setFlavor(flavor);

  System.out.print("Price: ");
  double price = input.nextDouble();
  b.setPrice(price);

  System.out.print("Is Sourdough: ");
  boolean isSourdough = input.nextBoolean();
  b.setIsSourdough(isSourdough);

  input.nextLine();

  System.out.println("\n~~~ Successfully Purchased Bread ~~~");
  System.out.println(b + "\n");

  // Pastry purchase
  System.out.print("Flavor: ");
  flavor = input.nextLine();
  p.setFlavor(flavor);

  System.out.print("Price: ");
  price = input.nextDouble();
  p.setPrice(price);

  // Clear the line after reading a double
  input.nextLine();

  System.out.print("Pastry Type: ");
  String type = input.nextLine();
  p.setType(type);

  System.out.println("\n~~~ Successfully Purchased Pastry ~~~");
  System.out.println(p + "\n");

  // --- CAKE PURCHASE ---
  Cake c = new Cake();

  System.out.print("Flavor: ");
  flavor = input.nextLine();
  c.setFlavor(flavor);

  System.out.print("Price: ");
  price = input.nextDouble();
  c.setPrice(price);

  System.out.print("Layers: ");
  int layers = input.nextInt();
  c.setLayers(layers);

  input.nextLine(); // clear the buffer after reading a number

  System.out.println("\n~~~ Successfully Purchased Cake ~~~");
  System.out.println(c + "\n");

  input.close();
  }
}