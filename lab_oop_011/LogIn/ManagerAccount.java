package edu.faf.oop.LogIn;
import java.util.ArrayList;

public class ManagerAccount extends LogIn {
    //private ArrayList<Staff> staffList = new ArrayList<>();
    public ManagerAccount(String itemId){
        super(itemId);
        managerId = "Manager";
        managerPassword = "MPassword";
    }

    public boolean checkLogIn()
    {
        if(inputId.equals(managerId) && inputPassword.equals(managerPassword)) {
            logInStatus = "Manager";
            System.out.println("Welcome, Manager");
            return true;
        }
        else {
            System.out.println("Unrecognized user");
            return false;
        }

    }
    //public add/ remove staff or manager.
}
