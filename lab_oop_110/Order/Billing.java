package Order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Menu.Menu;
import Person.Customer;
import Staff.Security;

public class Billing extends Order{
    private final String date;
    private final String paymentType;
    private Customer customer;
    private Security security;
    LocalDateTime now = LocalDateTime.now();


    //Compositon
    public Billing(String paymentType, Customer customer, Security security, Menu menu) {
        super(menu);
        this.paymentType = paymentType;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.date = dtf.format(now);
        this.customer = customer;
        this.security = security;
    }

    public void releaseBill(){
        customer.identifyType();
        if(customer.getMoney() >= totalPrice) {
            String check = customer.getCustomerType();
            double discountedPrice;
            if (check.equals("child")) {
                discountedPrice = totalPrice - totalPrice * 0.08;
                totalPrice = discountedPrice;
            }
            if (check.equals("senior")) {
                discountedPrice = totalPrice - totalPrice * 0.1;
                totalPrice = discountedPrice;
            }
            System.out.println("Customer asked for a bill.\n");
            customer.payedAmount = totalPrice;
            System.out.println("Bill ID - " + createOrderNumber() + "\n");
            System.out.println("Ordered food - " + getOrderedFood() + "\n");
            System.out.println("Amount to be payed - " + totalPrice + "\n");
            System.out.println("Payment Type - " + paymentType + "\n");
            System.out.println("Date - " + date + "\n");
        }
        else {
            System.out.println("No enough money");
            System.out.println("Customer is trying to leave the restaurant....");
            if (security.badCustomer()) {
                System.out.println("Manager is calling the police\n");
            }
        }


    }
}
