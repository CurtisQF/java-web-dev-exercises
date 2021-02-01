package exercises.Chap7.technology.main;

public class Computer extends AbstractEntity {

    //Variables
     private int screenWidth;
     private int screenHeight;
     private String manufactureYear;

    //Constructor
    public Computer (int screenWidth, int screenHeight, String manufactureYear) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufactureYear = manufactureYear;
    }

    //Get-set

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    //Methods
    public int processTwoPlusTwo() {
        return 2+2;
    }

    public void tellMeAJoke() {
        System.out.println("Here is a super funny joke.");
    }

}
