public class Cart {

      // Declaration of class Product as variable p, varaible itemQty origin.
      private Product p;
      int itemQty;

      // Cart constructor
      private Cart(int productId, double price, int itemQty) {

            p.productId = productId;
            p.price = price;
            this.itemQty = itemQty;
            
      }

      public void placeOrder (int customId, int productId, int itemQty, double totalPrice) {

            System.out.println("Placing order...");

      }
}