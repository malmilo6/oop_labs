package edu.faf.oop.Staff;

import java.util.ArrayList;

public class Manager extends Staff {

    private final ArrayList<Staff> employeeList = new ArrayList<>();

    public Manager(String firstName, String lastName, double salary, long experience, String employmentDate,String itemId) {
        super(firstName, lastName, salary, experience, employmentDate,itemId);

    }

    public void manageEmployeeAdd(Staff staff){
        employeeList.add(staff);
    }
    public void manageEmployeeRemove(Staff staff){
        employeeList.remove(staff);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary + experience*0.1*salary;
    }
}
