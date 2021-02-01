package exercises.Chap7.technology.main;

public class Smartphone extends Computer {

    //Variables
    private boolean isConnectedTo5G;

    //Constructor
    public Smartphone(int screenWidth, int screenHeight, String manufactureYear, boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    //Get-set

    public boolean isConnectedTo5G() {
        return isConnectedTo5G;
    }

    public void setConnectedTo5G(boolean connectedTo5G) {
        isConnectedTo5G = connectedTo5G;
    }

    //Methods
    public void makePhoneCall(String phoneNumber) {
        System.out.println("Calling: " + phoneNumber);
    }
}
