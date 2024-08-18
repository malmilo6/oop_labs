package edu.faf.oop;

public class LogIn {
    private final String validManagerId ;
    private final String validManagerPassword ;

    private final String validStaffId;
    private final String validStaffPassword;
    private String logInStatus;
    private String inputId;
    private String inputPassword;

    public LogIn()
    {
        validManagerId = "Manager";
        validStaffId = "Staff";
        validManagerPassword = "MPassword";
        validStaffPassword = "SPassword";
    }

    public void setInputId(String userId)
    {
        inputId = userId;
    }

    public void setInputPassword(String userPassword)
    {
        inputPassword = userPassword;
    }

    public boolean checkLogIn()
    {
        if(inputId.equals(validManagerId) && inputPassword.equals(validManagerPassword))
        {
            logInStatus = "Manager";
            return  true;
        }

        if(inputId.equals(validStaffId) && inputPassword.equals(validStaffPassword))
        {
            logInStatus = "Staff";
            return true;
        }
        else
            return false;
    }
    public String getStatus()
    {
        return logInStatus;
    }
}
