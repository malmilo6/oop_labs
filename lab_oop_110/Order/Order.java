package Order;

import Menu.Menu;

import java.util.Random;

public abstract class Order {
    protected long orderNumber;
    protected String orderedFood;
    public double totalPrice;
    protected Menu menu;
    public void setOrderedFood(String orderedFood) {
        this.orderedFood = orderedFood;
    }

    public Order(Menu menu){
        this.menu = menu;
    }
    public String getOrderedFood(){
        return orderedFood;
    }
    public int createOrderNumber(){
        Random randInt = new Random();
        return 100 + randInt.nextInt(901);
    }
    public void createOrder() {
        menu.fillMenuPrice();
        menu.fillMenu();
        Random randIndex = new Random();
        int index = randIndex.nextInt(11);
        orderedFood = menu.getMenuItem(index);
        totalPrice = menu.getItemPrice(orderedFood);
    }
}
