public class Gadget extends Product {
      
protected String brand;
protected String specs;
      
      public Gadget(String productName, int productId, double price, int stockQty, String brand, String specs){
            super(productName, productId, price, stockQty);
            this.brand = brand;
            this.specs = specs;
      }
}