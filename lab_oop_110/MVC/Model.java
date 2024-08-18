package MVC;

import Menu.Menu;
import Order.Billing;
import Person.Customer;
import Staff.Cook;
import Staff.Manager;
import Staff.Security;
import Staff.Waiter;

public class Model {
    Waiter waiter = new Waiter("Andrew", "Kurek", 500.0, 2,
            "12/11/2019");
    Manager manager = new Manager("Steve", "China", 850.0, 8, "09/12/2015" );
    Cook cook = new Cook("Tisha", "Brown", 700.0, 7, "09/01/2018");
    Security security = new Security("Ray", "Goodson", 600.0, 12, "09/01/2015");
    Menu menu = new Menu();

    Customer customer = new Customer("Average customer", 13, "M", "Child", waiter, cook);
    Billing bill = new Billing("CC", customer, security, menu);

}
