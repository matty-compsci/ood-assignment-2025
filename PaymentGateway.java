// PaymentGateway class
public class PaymentGateway {

      // Attribute declaration
      private Customer customer;
      private Order order;
      private Cart cart;
      private Product product;
      int totalPrice;

      // Constructor with global and local variables
      public PaymentGateway(int totalPrice, int customId, int orderId, int itemQty, int productId) {

            customer.customId = customId;
            order.orderId = orderId;
            cart.itemQty = itemQty;
            product.productId = productId;
            this.totalPrice = totalPrice;

      }

      // Calculation method for total price
      void calcTotalPrice() {
            System.out.println("Calculating Total Price..."); 
      }
 
      // Method to request payment from third-party
      void requestPayment() {
            System.out.println("Requesting Payment...");
      }
 
      // Verification for payment
      void verifyPayment() {
            System.out.println("Verifying Payment...");
      }

      // Payment completion
      void completePayment() {
            System.out.println("Payment complete.");
      }

}