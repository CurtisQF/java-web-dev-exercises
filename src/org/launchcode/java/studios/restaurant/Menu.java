package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //Variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    //Constructors
    public Menu() {
        this.lastUpdated = new Date();
    }

    //Methods
    //Getters & Setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //Get last updated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //Other Methods

    //Add menu item
    public void addMenuItem(MenuItem item) {
        //Bonus: loop through menu items to eliminate adding a duplicate
        for(MenuItem menuItem : this.menuItems) {
            //Compare the parameter to the current array of menu items
            if(item.equals(menuItem)) {
                System.out.println("WARNING: This item already exists!");
                return;
            }
        }
        //If item isn't a duplicate, add it
        this.menuItems.add(item);
        //Update last updated date:
        this.lastUpdated = new Date();
    }

    //Remove menu item
    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
        //Update last updated:
        this.lastUpdated = new Date();
    }

    //Print menu
    public String toString() {
        String returnString = "";
        //loop through menu items array list
        for (MenuItem item : this.menuItems) {
            //print out info on that item
            returnString += item.toString() + "\n\n";
        }
    return returnString;
    }


}
