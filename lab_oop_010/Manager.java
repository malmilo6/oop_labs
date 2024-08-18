package edu.faf.oop;

public class Manager {
    private String mFullName;
    private String  mEmploymentDate;
    private long mSalary;
    private long mExperience;

    public Manager(String fullName, String date, long salary, long exp)
    {
        mFullName = fullName;
        mEmploymentDate = date;
        mSalary = salary;
        mExperience = exp;
    }
    public void setName(String mFullName)
    {
        this.mFullName = mFullName;
    }
    public String getName()
    {
        return mFullName;
    }

    public double getSalary()
    {
        return mSalary + mSalary*0.05*mExperience;
    }

    public void setSalary(long salary)
    {
        this.mSalary = salary;
    }

    public void setDate(String mEmploymentDate)
    {
        this.mEmploymentDate = mEmploymentDate;
    }

    public String getDate()
    {
        return mEmploymentDate;
    }

    public void setExp(long mExperience)
    {
        this.mExperience = mExperience;
    }

    public long getExp()
    {
        return mExperience;
    }
}
