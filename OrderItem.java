// OrderItem class, cannot exist without Order class
public class OrderItem {

      // Order, Product, and Cart callers
      private Order o;
      private Product p;
      private Cart c;
      
      // Constructor using attributes from global classes
      public OrderItem(int orderId, int productId, int itemQty) {

      o.orderId = orderId;
      p.productId = productId;
      c.itemQty = itemQty;

    }
}