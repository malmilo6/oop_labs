package MVC;

public class Controler {
    private Model model, res;
    private View view;
    protected double waiterSal, cookSal, managerSal, securitySal, total;

    public Controler(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void simulation() {

        int customers = 300;

            for (int i = 0; i < customers; i++) {
                model.bill.createOrder();
                model.bill.releaseBill();
                model.customer.rateService();
                model.manager.setRestaurantMonthIncome(model.customer.payedAmount);
            }
            model.manager.setExperience(1);
            model.waiter.setExperience(1);
            model.cook.setExperience(1);
            model.security.setExperience(1);

            model.manager.setStaffIncome(model.manager);
            model.manager.setStaffIncome(model.cook);
            model.manager.setStaffIncome(model.security);
            model.manager.setStaffIncome(model.waiter);

            waiterSal = model.waiter.getSalary();
            managerSal = model.manager.getSalary();
            cookSal = model.cook.getSalary();
            securitySal = model.security.getSalary();
            total = model.manager.getRestaurantMonthIncome();

            model.manager.resetRestaurantMonthIncome();
        }


    public void updateView(){
        view.printViewControler(waiterSal, cookSal, managerSal, securitySal, total);
    }


}
