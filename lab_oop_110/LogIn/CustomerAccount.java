package LogIn;

public class CustomerAccount extends LogInA implements LogInI{
    private final String customerId;
    private final String customerPass;

    public CustomerAccount() {
        customerId = "Customer";
        customerPass = "PCustomer";
    }

    @Override
    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    @Override
    public void setPasswordId(String inputPassword) {
        this.inputPassword = inputPassword;
    }


    @Override
    public void checkLogIn() {
        if(inputId.equals(customerId) && inputPassword.equals(customerPass))
        {
            this.loginStatus = "Customer";
            System.out.println("Welcome, Dear Customer");
        }
    }
}
