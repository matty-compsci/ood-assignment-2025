//Admin class inheriting User class
public class Admin extends User{

//Declaring private variables for admin class
private int adminId;
private String lastLogin;

//constructor
public Admin(int adminId,String lastLogin,String userName,String email,String pass){
//calling parent class constructor
super(userName, email, pass);
this.adminId=adminId;
this.lastLogin=lastLogin;   
}


//adminID getter 
public int getAdminId(){

    return adminId;
}

//adminID setter

public void setAdminId(int adminId){
    this.adminId=adminId;
}

//lastLogin getter

public String getLastLogin(){

    return lastLogin;
}

//LastLogin setter

public void setLastLogin(String lastLogin){

    this.lastLogin=lastLogin;
}

// Display user details
public static Customer viewUser(int customId,String userName){
   
    System.out.println("Viewing user details...");
    System.out.println("customId: " + customId + ", userName: " + userName);
    return new Customer("",customId, userName, "", "");
}

// Add new gadget
public Product addProduct(Product product){

    System.out.println("Adding new gadget...");
    return product;
}

// Update existing gadget
public Product updateProduct(Product product){

    System.out.println("Updating gadget information...");
     return product;
}

// Remove gadget
public void removeProduct(Product product){

    System.out.println("Removing gadget from inventory...");    
}
}

    

