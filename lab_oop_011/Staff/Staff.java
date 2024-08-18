package edu.faf.oop.Staff;

import edu.faf.oop.RootClass.Root;

public class Staff extends Root{
    private String firstName;
    private String lastName;
    protected double salary;
    protected long experience;
    private String employmentDate;

    public Staff(String firstName, String lastName, double salary, long experience, String employmentDate,String itemId) {
        super(itemId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.experience = experience;
        this.employmentDate = employmentDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String LastName) {
        this.lastName = LastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }
    public long getExperience() {
        return experience;
    }
    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }
    public String getEmploymentDate() {
        return employmentDate;
    }

}
