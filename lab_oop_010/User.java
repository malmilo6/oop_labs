package edu.faf.oop;

public class User {
    private String firstName;
    private String lastName;
    private int id;
    private double money;

    public User(String firstName, String lastName, int id, double money)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.money = money;
    }

    public void setName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName()
    {
        return firstName + lastName;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setMoney(double money)
    {
        this.money = money;
    }

    public double getMoney()
    {
        return money;
    }

}
