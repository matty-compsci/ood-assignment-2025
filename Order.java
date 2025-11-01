// Order class
public class Order {

      // Attribute declaration
      protected int orderId;
      protected int customId;
      protected int productId;
      protected double totalPrice;

      // Constructor, all local variables
      public Order(int orderId, int customId, int productId, double totalPrice){
            this.orderId = orderId;
            this.customId = customId;
            this.productId = productId;
            this.totalPrice = totalPrice;
      }

      // Method for checkout
      void checkOut(Order order){
            System.out.println("Proceeding to checkout.");
      }

}