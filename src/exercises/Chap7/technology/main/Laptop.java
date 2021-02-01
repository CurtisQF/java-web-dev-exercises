package exercises.Chap7.technology.main;

public class Laptop extends Computer {

    //Variables
    private boolean isIntelliJOpen;

    //Constructor
    public Laptop(int screenWidth, int screenHeight, String manufactureYear) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpen = false;
    }

    public Laptop(int screenWidth, int screenHeight, String manufactureYear, boolean isIntelliJOpen) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpen = isIntelliJOpen;
    }
    //Get-set

    public boolean isIntelliJOpen() {
        return isIntelliJOpen;
    }

    public void setIntelliJOpen(boolean intelliJOpen) {
        isIntelliJOpen = intelliJOpen;
    }

    //Methods
    public void openIntelliJ() {
        this.isIntelliJOpen = true;
        System.out.println("IntelliJ is now open.");
    }
}
