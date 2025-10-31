public class Order {

      protected int orderId;
      protected int customId;
      protected int productId;
      protected double totalPrice;

      public Order(int orderId, int customId, int productId, double totalPrice){
            this.orderId = orderId;
            this.customId = customId;
            this.productId = productId;
            this.totalPrice = totalPrice;
      }

      void checkOut(Order order){
            System.out.println("Proceeding to checkout.");
      }

}