public class Gadget extends Product {

// Attribute declaration for brand and specifications
protected String brand;
protected String specs;
      
// Constructor for Gadget objects
      public Gadget(String productName, int productId, double price, int stockQty, String brand, String specs){
            super(productName, productId, price, stockQty);
            this.brand = brand;
            this.specs = specs;
      }
}