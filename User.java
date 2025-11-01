public abstract class User{

//Declaring the private variables for User class
protected String userName;
protected String email;
protected String pass;

//constructor
public  User(String userName, String email, String pass){
//Refer  the variables using instance variables.
    this.userName = userName;
    this.email = email;
    this.pass = pass;  
}

//create getters and setters for the private variables.

//userName getter   
public  String getUserName(){

    return userName;
}
//userName setter
public void setUserName(String userName){

    this.userName = userName;
}

//email getter
public String getEmail(){
    return email;
}

//email setter
public void setEmail(String email){

    this.email=email;
}

//pass getter
public String getPass(){

    return pass;
}

//pass setter

public void setPass(String pass){

    this.pass=pass;
}
//Static method without creating object
public static void UserDetails(String userName,String email, String pass){

}

//browse products
public void browse(String productName){

    System.out.println("Browsing gadgets...");
}
}

