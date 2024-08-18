package edu.faf.oop.LogIn;

public class CustomerAccount extends LogIn{

    private boolean isServed = false;

    public CustomerAccount(String itemId) {
        super(itemId);
        customerId = "Customer";
        customerPassword = "CPassword";
    }

    public boolean checkLogIn()
    {
        if(inputId.equals(customerId) && inputPassword.equals(customerPassword)) {
            logInStatus = "Staff";
            System.out.println("Welcome, Dear Customer");
            return true;
        }
        else {
            System.out.println("Unrecognized user");
            return false;
        }
    }

    //rate service
}
