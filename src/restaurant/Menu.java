package restaurant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> foodItems;

    public ArrayList<MenuItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<MenuItem> foodItems) {
        this.foodItems = foodItems;
    }

    public Menu(ArrayList<MenuItem> foodItems, String date) {
        this.foodItems = foodItems;
    }
}
