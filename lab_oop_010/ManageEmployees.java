package edu.faf.oop;
import java.util.ArrayList;

public class ManageEmployees {
    public ArrayList<Staff> staffList = new ArrayList<Staff>();
    public ArrayList<Manager> managerList = new ArrayList<Manager>();

    public void addStaff(Staff staff)
    {
        this.staffList.add(staff);
    }

    public void removeStaff(Staff staff) {this.staffList.remove((staff));}

    public void addManager(Manager manager)
    {
        this.managerList.add(manager);
    }

    public void removeManager(Manager manager)
    {
        this.managerList.remove(manager);
    }

}
