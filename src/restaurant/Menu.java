package restaurant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> foodItems;

    public Menu(ArrayList<MenuItem> foodItems) {
        this.foodItems = foodItems;
    }

    public ArrayList<MenuItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<MenuItem> foodItems) {
        this.foodItems = foodItems;
    }

    public void readsMenu(){
        System.out.println("MENU:");
        for(MenuItem item : this.foodItems){
            if(item.getIsNew()){
                System.out.print("NEW ITEM! ");
            }System.out.println("[" + item.getCategory() + "] " + item.getName() + " ($" + item.getPrice() + ")" + ": " + item.getDescription());
        }
    }
}
