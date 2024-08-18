package Staff;

import java.util.Random;

public class Waiter extends Staff {

    public Waiter(String firstName, String lastName, double salary, int experience, String employmentDate) {
        super(firstName, lastName, salary, experience, employmentDate);
    }


    public double servingTime() {
        Random randTime = new Random();
        return 5.0 + randTime.nextDouble(15.0);
    }

    @Override
    public void workingStatus() {
        String[] actions = new String[4];
        actions[0] = "Waiter is Busy\n";
        actions[1] = "Waiter is Serving the client\n";
        actions[2] = "Waiter is Free\n";
        actions[3] = "Waiter is very BUSY. Scrolling TikTok\n";
        Random randInt = new Random();
        int x = randInt.nextInt(1,4);
        System.out.println(actions[x-1]);
    }


    @Override
    public double getSalary() {
        return salary + experience*0.06*salary + staffMonthIncomeP;
    }

}
