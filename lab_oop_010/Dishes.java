package edu.faf.oop;
import java.util.HashMap;

public class Dishes {
    public HashMap<String, Double> menuList = new HashMap<>();

    public void setList()
    {
        menuList.put("Continental Breakfast",25.0);
        menuList.put("American Breakfast",55.0);
        menuList.put("English Breakfast",45.0);
        menuList.put("Italian Breakfast",27.0);
        menuList.put("Indian Breakfast",43.0);
    }

}
