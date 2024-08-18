package Menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu implements MenuI{
    protected final HashMap<String, Double> menu = new HashMap<>();
    protected final ArrayList<String > menuList = new ArrayList<>();
    
    @Override
    public void fillMenu() {
        menuList.add("Hamburger");
        menuList.add("Sandwich");
        menuList.add("Taco");
        menuList.add("Burrito");

        menuList.add("Milk Shake");
        menuList.add("Coca cola");
        menuList.add("Coffee");
        menuList.add("Tea");
        menuList.add("Orange juice");

        menuList.add("Cake");
        menuList.add("Tiramisu");
        menuList.add("Apple pie");
        menuList.add("Cookies");

        menuList.add("Beef Burger");
        menuList.add("Pasta");
        menuList.add("Mixed salad");
        menuList.add("Chef salad");
        menuList.add("Tuna salad");

        menuList.add("Chicken soup");
        menuList.add("Pasta Fagioli soup");
        menuList.add("BBQ Beef");
        menuList.add("Beef meals");
    }

    @Override
    public void fillMenuPrice() {
        menu.put("Hamburger",30.0);
        menu.put("Sandwich",35.0);
        menu.put("Taco",30.0);
        menu.put("Burrito",20.0);

        menu.put("Milk Shake",15.0);
        menu.put("Coca cola",13.0);
        menu.put("Coffee",10.0);
        menu.put("Tea",8.0);
        menu.put("Orange juice", 12.0);

        menu.put("Cake",12.0);
        menu.put("Tiramisu",20.0);
        menu.put("Apple pie",15.0);
        menu.put("Cookies",14.0);

        menu.put("Beef Burger",25.0);
        menu.put("Pasta", 18.78);
        menu.put("Mixed salad",21.0);
        menu.put("Chef salad",34.0);
        menu.put("Tuna salad",29.0);

        menu.put("Chicken soup",17.0);
        menu.put("Pasta Fagioli soup",21.40);
        menu.put("BBQ Beef",45.0);
        menu.put("Beef meals",35.0);

    }

    public ArrayList<String> getMenuList() {
        return menuList;
    }

    public HashMap<String, Double> getMenu() {
        return menu;
    }

    public String getMenuItem(int index) {
        return menuList.get(index);
    }

    public double getItemPrice(String item){
        return menu.get(item);
    }
}
