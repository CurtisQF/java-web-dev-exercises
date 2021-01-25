package org.launchcode.java.studios.restaurant;

public class MenuItem {

    //Variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //Constructors
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not categorized";
        this.isNew = false;
    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //Methods
    //Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //isNew method
    public Boolean isNew() {
        return isNew;
    }

    public void setisNew(Boolean aNew) {
        isNew = aNew;
    }


    //Other Methods

    //Print the Menu Item
    @Override
    public String toString() {
        String returnString = "";
        returnString += "Item name: " + this.name + "\n";
        returnString += "Description: " + this.description + "\n";
        returnString += "Price: " + this.price + "\n";
        returnString += "Category: " + this.category + "\n";
        returnString += "Is New: " + this.isNew + "\n";
        return returnString;
    }

    //Compare is two Menu Items are equal
    @Override
    public boolean equals(Object obj) {
        //Does the obj being passed and the current instance of Menu Item have the same memory address
        if(obj == this) return true;
        //If MenuItem is not a MenuItem
        if (!(obj instanceof  MenuItem)) {
            return false;
        }
        //Cast (transform) the obj into a MenuItem
        MenuItem menuItem = (MenuItem) obj;
        if(menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
            return true;
        else return false;
    }
}
