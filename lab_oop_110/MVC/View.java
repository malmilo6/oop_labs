package MVC;

public class View {

    public void printViewControler(double waiter, double cook, double sec, double manager, double total){
        System.out.println("================MONTHLY SALARY================\n");
        System.out.println("Waiter Salary " + waiter + "\n");
        System.out.println("Cook Salary " +  cook + "\n");
        System.out.println("Security Salary " +  sec + "\n");
        System.out.println("Manager Salary " + manager + "\n");

        System.out.println("Total month income - " + total + "\n");
        System.out.println("==============================================\n");
    }

}
