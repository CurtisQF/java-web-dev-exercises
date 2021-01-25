package org.launchcode.java.studios.restaurant;

public class Restaurant {

    public static void main(String[] args){
        MenuItem item1 = new MenuItem("Salad", "Delicious Greens", 7.50, "Healthy", true);
        MenuItem item2 = new MenuItem("Salad", "Delicious Greens", 7.50, "Healthy", true);
        MenuItem item3 = new MenuItem("Cake", "Chocolate Torte", 5.50, "Unhealthy", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);
        myMenu.removeMenuItem(item3);


        //Testing

        //toString
//        System.out.println(item1.toString());

        //equals
//        System.out.println(item1.equals(item2));
//        System.out.println(item1.equals(item3));

        //Print menu
        System.out.println(myMenu);

    }
}
