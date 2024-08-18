package Person;

import Staff.Cook;
import Staff.Waiter;

import java.util.Random;

public class Customer implements CustomerI{
    private final String name;
    private final int age;
    private final String gender;
    private final double money;
    private String customerType;
    private Waiter waiter;
    private Cook cook;
    public double payedAmount;


    public Customer(String name, int age, String gender, String customerType, Waiter waiter, Cook cook) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = setRandomMoney();
        this.customerType = customerType;
        this.waiter = waiter;
        this.cook = cook;
    }
    @Override
    public double setRandomMoney()
    {
        Random random = new Random();
        return random.nextDouble(80-10) + 10;
    }

    @Override
    public void rateService() {
        if(waiter.servingTime() < 10 ) {
            System.out.println("Customer serving rate : Good service...\n");
        } else {
            System.out.println("Customer serving rate : Satisfactory service...\n");
        }
        if(waiter.servingTime() > 10 && !cook.foodStatus()) {
            System.out.println("Customer kitchen rate : Satisfactory food... \n");
        } else {
            System.out.println("Customer kitchen rate : Tasty food!");
        }
    }

    @Override
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

    public double getMoney(){
        return this.money;
    }
    public String getCustomerType(){
        return this.customerType;
    }
}
