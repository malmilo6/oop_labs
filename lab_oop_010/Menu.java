package edu.faf.oop;
import java.util.ArrayList;

public class Menu {
    private String menuType;
    private final ArrayList<String> items = new ArrayList<String>();


    public Menu(String menuType)
    {
        this.menuType = menuType;
    }

    public void fillMenu() {
        items.add("1. Continental Breakfast");
        items.add("2. American Breakfast");
        items.add("3. English Breakfast");
        items.add("4. Italian Breakfast");
        items.add("5. Indian Breakfast");
    }

    public boolean checkAvailability(String meal)
    {
        boolean availability = false;

        for (String item : items) {
            if (meal.equals(item)) {
                availability = true;
                break;
            }
        }
        return availability;
    }

    public void printMenu()
    {
        for(String item : items)
        {
            System.out.println(item + "\n");
        }
    }

}
