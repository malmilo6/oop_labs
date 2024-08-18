package Staff;

import java.util.Random;

public class Security extends Staff{
    public Security(String firstName, String lastName, double salary, int experience, String employmentDate) {
        super(firstName, lastName, salary, experience, employmentDate);
    }

    public boolean badCustomer() {
        boolean status;
        Random bool = new Random();
        status = bool.nextBoolean();

        System.out.println("Security is trying to catch running customer");
        if (status) {
            System.out.println("Customer is caught\n");
        } else {
            System.out.println("Successful escape\n ");
        }
        return status;
    }

    @Override
    public void workingStatus() {
        boolean status;
        Random bool = new Random();
        status = bool.nextBoolean();

        if (status) {
            System.out.println("Security is sleeping...Zzzz\n");
        } else {
            System.out.println("Security is on eye!\n");
        }
    }

    @Override
    public double getSalary(){
        return salary + experience*0.05*salary + staffMonthIncomeP;
    }

}
