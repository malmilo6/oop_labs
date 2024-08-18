package edu.faf.oop;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Billing {
    private long id;
    private double totalCost;
    private String date;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();


    public Billing(Order order)
    {
        this.id = order.getOrderNumber();
        this.totalCost = order.getPrice();
        this.date = dtf.format(now);
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public long getId()
    {
        return id;
    }

    public void setTotalCost(long totalCost)
    {
        this.totalCost = totalCost;
    }
    public double getTotalCost()
    {
        return totalCost;
    }

    public String getDate()
    {
        return date;
    }

    public void showBill(Cashregister cashregister){
        System.out.println("Bill ID - " + id + "\n");
        System.out.println("Amount to be payed - " + totalCost + "\n");
        System.out.println("Payment Type - " + cashregister.getPaymentType() + "\n");
        System.out.println("Cashier Name -" + cashregister.getCashierName() + "\n");
        System.out.println("Date - " + date + "\n");
    }

}
