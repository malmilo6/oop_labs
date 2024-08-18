package edu.faf.oop;

public class Cashregister {
    private boolean paymentStatus;
    private String cashierName;
    private String paymentType;

    public Cashregister(String cashierName, String paymentType)
    {
        this.cashierName = cashierName;
        this.paymentType = paymentType;
    }

    public String getCashierName()
    {
        return cashierName;
    }
    public String getPaymentType()
    {
        return paymentType;
    }


    public void setPaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }

    public void releaseBill(Billing billing, Cashregister cashregister) {
    billing.showBill(cashregister);
    }

}
