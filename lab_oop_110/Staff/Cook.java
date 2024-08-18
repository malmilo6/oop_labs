package Staff;

import java.util.Random;

public class Cook extends Staff{
    public Cook(String firstName, String lastName, double salary, int experience, String employmentDate) {
        super(firstName, lastName, salary, experience, employmentDate);
    }

    public boolean foodStatus() {
        Random rand = new Random();
        return rand.nextBoolean();
    }

    @Override
    public void workingStatus() {
        Random rand = new Random();
        if(rand.nextBoolean()){
            System.out.println("Cook is preparing your order\n");
        } else {
            System.out.println("Cook is waiting for clients' orders\n");
        }
    }

    @Override
    public double getSalary() {
        return salary + experience*0.07*salary + staffMonthIncomeP;
    }
}
