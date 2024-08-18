package Menu;

import java.util.ArrayList;
import java.util.HashMap;

public interface MenuUpdaterI {
    void updateMenu(String food, double price, HashMap<String, Double> menu, ArrayList<String> menuList);

}
