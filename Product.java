// Not to be initialized; just in case stakeholders would like to add any other product (merch, etc.)
abstract class Product {
 
      // Attribute declaration, to be inherited by subclass
      protected String productName;
      protected int productId;
      protected double price;
      protected int stockQty;

      // Constructor, local variables
      public Product(String productName, int productId, double price, int stockQty) {
            this.productName = productName;
            this.productId = productId;
            this.price = price;
            this.stockQty = stockQty;
      }

      // Method for displaying details
      void displayDetails(int productId, String productName) {
            System.out.println("Displaying product details...");
      }
}