package com.company;

import restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {
        MenuItem itemOne = new MenuItem("Hamburger", 6.00, "Juicy patty between between buns.", "Main Course", true);

        System.out.println(itemOne.getName());
    }
}
