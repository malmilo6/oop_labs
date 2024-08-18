package Staff;

public abstract class Staff{
    private String firstName;
    private String lastName;
    protected double salary;
    protected int experience;
    private String employmentDate;
    protected double staffMonthIncomeP;

    public  Staff(String firstName, String lastName, double salary, int experience, String employmentDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.experience = experience;
        this.employmentDate = employmentDate;
    }
    public abstract void workingStatus();

    public void setExperience(int experience) {
        this.experience += experience;
    }
    public int getExperience() {
        return this.experience;
    }
    public abstract double getSalary();

    public void setSalary(double salary){
        this.salary = salary;
    }

}
