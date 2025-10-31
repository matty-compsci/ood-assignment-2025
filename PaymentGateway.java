public class PaymentGateway {

      private Customer customer;
      private Order order;
      private Cart cart;
      private Product product;
      int totalPrice;

      public PaymentGateway(int totalPrice, int customId, int orderId, int itemQty, int productId) {

            customer.customId = customId;
            order.orderId = orderId;
            cart.itemQty = itemQty;
            product.productId = productId;
            this.totalPrice = totalPrice;

      }

      void calcTotalPrice() {
            System.out.println("Calculating Total Price..."); 
      }

      void requestPayment() {
            System.out.println("Requesting Payment...");
      }

      void verifyPayment() {
            System.out.println("Verifying Payment...");
      }

      void completePayment() {
            System.out.println("Payment complete.");
      }

}