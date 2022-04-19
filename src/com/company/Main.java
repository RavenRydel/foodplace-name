package com.company;

import restaurant.MenuItem;

import restaurant.Menu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();

        MenuItem itemOne = new MenuItem("Hamburger", 6.99, "Juicy patty between between buns.", "Main Course", true);
        MenuItem itemTwo = new MenuItem("Hotdog", 5.99, "Hot dog inside of a hot dog bun with ketchup and mustard.", "Main Course", false);
        MenuItem itemThree = new MenuItem("Jalapeno Poppers", 3.99, "Breaded peppers stuffed with cream cheese and fried.", "Appetizer", false);
        MenuItem itemFour = new MenuItem("Calamari", 4.99, "Breaded and fried squid rings.", "Appetizer", true);
        MenuItem itemFive = new MenuItem("Brownie", 2.99, "Fudge brownie with chocolate chips.", "Dessert", true);
        MenuItem itemSix = new MenuItem("Ice cream", 1.99, "Your choice of chocolate, vanilla, or strawberry.", "Dessert", false);

        items.add(itemOne);
        items.add(itemTwo);
        items.add(itemThree);
        items.add(itemFour);
        items.add(itemFive);
        items.add(itemSix);

        Menu newMenu = new Menu(items);

        newMenu.readsMenu();
    }
}
