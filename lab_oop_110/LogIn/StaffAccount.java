package LogIn;

public class StaffAccount extends LogInA implements LogInS{


    private final String staffId;
    private final String staffPass;
    private final String staffIdCard;
    private  String inputIdCard;

    public StaffAccount() {
        staffId = "Staff";
        staffPass = "SPass";
        staffIdCard = "IDStaff";

    }

    @Override
    public void setInputId(String inputId){
        this.inputId = inputId;
    }

    @Override
    public void setPasswordId(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    @Override
    public void setInputIdCard(String inputIdCard) {
        this.inputIdCard = inputIdCard;
    }

    @Override
    public void checkLogIn() {
        if(inputId.equals(staffId) && inputPassword.equals(staffPass) && inputIdCard.equals(staffIdCard))
        {
            this.loginStatus = "Staff";
            System.out.println("Welcome, Dear Staff");
        }
    }
}
