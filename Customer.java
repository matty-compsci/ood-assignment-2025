class Customer extends User{

private String orderHistory;
protected int customId;

//constructor
public Customer(String orderHistory,int customId,String userName,String email,String pass){
   //calling parent class constructor
   super(userName, email, pass);
   this.orderHistory=orderHistory;
   this.customId=customId;

}

//orderHistory getter
public String getOrderHistory(){
    return orderHistory;
}

//orderHistory setter
public void setOrderHistory(String orderHistory){

    this.orderHistory=orderHistory;
}

//customId getter
public int getCustomId(){
    return customId;
}
//customId Setter
public void setCustomId(int customId){
    this.customId=customId;
}

//view order history
public String viewOrderHistory(int customId, Product product, Order order){
    System.out.println("Viewing order history for customer ID: " + customId);  
    return  orderHistory;

}

//Placing order from cart
public Order orderFromCart(Order order){
    System.out.println("Placing order from cart...");
    return order;
}

//Making payment for the order
public void makePayment(Order order){

    System.out.println("Making payment for the order...");
}
}