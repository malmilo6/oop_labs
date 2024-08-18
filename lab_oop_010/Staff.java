package edu.faf.oop;

public class Staff {
    private String sFullName;
    private String  sEmploymentDate;
    private long sSalary;
    private long sExperience;

    public Staff(String fullName, String date, long salary, long exp)
    {
        sFullName = fullName;
        sEmploymentDate = date;
        sSalary = salary;
        sExperience = exp;
    }
    public void setName(String sFullName)
    {
        this.sFullName = sFullName;
    }
    public String getName()
    {
        return sFullName;
    }

    public double getSalary()
    {
        return sSalary + sSalary*0.03*sExperience;
    }

    public void setSalary(long salary)
    {
        this.sSalary = salary;
    }

    public void setDate(String sEmploymentDate)
    {
        this.sEmploymentDate = sEmploymentDate;
    }

    public String getDate()
    {
        return sEmploymentDate;
    }

    public void setExp(long sExperience)
    {
        this.sExperience = sExperience;
    }

    public long getExp()
    {
        return sExperience;
    }
}
