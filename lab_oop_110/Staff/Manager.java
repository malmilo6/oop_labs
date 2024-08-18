package Staff;

import java.util.Random;

public class Manager extends Staff {
    private double restaurantMonthIncome;


    public Manager(String firstName, String lastName, double salary, int experience, String employmentDate) {
        super(firstName, lastName, salary, experience, employmentDate);
    }


    public void setStaffIncome(Staff staff) {

        staff.staffMonthIncomeP = restaurantMonthIncome * 0.03;
    }
    public double getRestaurantMonthIncome(){
        return this.restaurantMonthIncome;
    }
    public void setRestaurantMonthIncome(double restaurantMonthIncome){
        this.restaurantMonthIncome += restaurantMonthIncome;
    }
    public void resetRestaurantMonthIncome(){
        this.restaurantMonthIncome = 0;
    }


    @Override
    public void workingStatus() {
        boolean status;
        Random bool = new Random();
        status = bool.nextBoolean();

        if(status){
            System.out.println("Manager is hiring new staff\n");
        }
        else {
            System.out.println("Manager fired somebody(\n");
        }
    }

    @Override
    public double getSalary() {
        return salary + experience*0.1*salary + staffMonthIncomeP;
    }
}
