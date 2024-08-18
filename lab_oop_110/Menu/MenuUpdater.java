package Menu;


import java.util.ArrayList;
import java.util.HashMap;

public class MenuUpdater implements MenuUpdaterI{
    @Override
    public void updateMenu(String food, double price, HashMap<String, Double> menu, ArrayList<String> menuList) {
        menuList.add(food);
        menu.put(food, price);
    }
}
