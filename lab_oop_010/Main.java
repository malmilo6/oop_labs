package edu.faf.oop;

public class Main {
    public static void main(String[] args)
    {
        LogIn account = new LogIn();
        account.setInputId("Staff");
        account.setInputPassword("SPassword");
        if(account.checkLogIn())
        {
            System.out.println("Hello, " + account.getStatus());
        }
        else
        {
            System.out.println("Wrong ID/Password");
        }

        Manager restManager = new Manager("Elvis Randi", "11/12/2021",1500,12);
        Staff waiter = new Staff("Mike Brown", "12/02/2022",800,8);
        ManageEmployees employeesList = new ManageEmployees();
        employeesList.addStaff(waiter);
        employeesList.addManager(restManager);

        User customer = new User("Max", "Ferik",200121,100);

        Menu menu = new Menu("Breakfast");

        menu.fillMenu();
        menu.printMenu();

        Dishes dishes = new Dishes();
        dishes.setList();

        Order userOrder = new Order();

        userOrder.createOrder(dishes);

        Billing bill = new Billing(userOrder);

        Cashregister payment = new Cashregister("Nelli Black","CC");
        payment.releaseBill(bill,payment);
    }
}
