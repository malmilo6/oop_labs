package edu.faf.oop.Person;

import edu.faf.oop.RootClass.Root;
public class Customer extends Person {
    private String gender;
    private double money;
    private String customerType;

    public Customer(String name, int age, double money, String gender, String itemId) {
        super(name, age, itemId);
        this.gender = gender;
        this.money = money;
    }

    public void identifyType() {
        if(age < 15) {
            customerType = "child";
        }
        if(age > 50) {
            customerType = "senior";
        }
        else
            customerType = "adult";
    }

    public String getCustomerType() {
        return customerType;
    }
    public String getGender() {
        return gender;
    }
    public double getMoney() {
        return money;
    }

    //public order;
}
