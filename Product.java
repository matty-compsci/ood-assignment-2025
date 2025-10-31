abstract class Product {

      protected String productName;
      protected int productId;
      protected double price;
      protected int stockQty;

      public Product(String productName, int productId, double price, int stockQty) {
            this.productName = productName;
            this.productId = productId;
            this.price = price;
            this.stockQty = stockQty;
      }

      void displayDetails(int productId, String productName) {
            System.out.println("Displaying product details...");
      }
}