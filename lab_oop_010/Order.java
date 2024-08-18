package edu.faf.oop;
import java.util.Scanner;
public class Order {
    private long orderNumber;
    private double totalPrice ;

    public void createOrder(Dishes dishes)
    {
        orderNumber = 12324;
        System.out.println("Please, select meal\n");
        Scanner myObj = new Scanner(System.in);

        int num = Integer.parseInt(myObj.nextLine());

        if(num == 1)
        {  totalPrice = dishes.menuList.get("Continental Breakfast"); }
        if(num == 2)
        {    totalPrice = dishes.menuList.get("American Breakfast"); }
        if(num == 3)
        {    totalPrice = dishes.menuList.get("English Breakfast"); }
        if(num == 4)
        {    totalPrice = dishes.menuList.get("Italian Breakfast"); }
        if(num == 5)
        {    totalPrice = dishes.menuList.get("Indian Breakfast"); }
        else
            {    System.out.println("Wrong input"); }

    }

    public double getPrice()
    {
        return totalPrice;
    }

    public long getOrderNumber()
    {
        return orderNumber;
    }


}
