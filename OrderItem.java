public class OrderItem {

      private Order o;
      private Product p;
      private Cart c;

      public OrderItem(int orderId, int productId, int itemQty) {

      o.orderId = orderId;
      p.productId = productId;
      c.itemQty = itemQty;

    }
}