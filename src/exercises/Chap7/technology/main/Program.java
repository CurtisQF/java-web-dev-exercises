package exercises.Chap7.technology.main;

public class Program {

    public static void main(String[] args) {

        Smartphone mySmartphone = new Smartphone(500, 1200, "2018", true);
//        mySmartphone.makePhoneCall("605-354-2702");
        int result = mySmartphone.processTwoPlusTwo();
//        System.out.println(result);
        System.out.println(mySmartphone.getId());

        Laptop myLaptop = new Laptop(1200, 2600, "2015", false);
//        myLaptop.openIntelliJ();
        int result2 = myLaptop.processTwoPlusTwo();
//        System.out.print(result2);
        System.out.println(myLaptop.getId());

        Computer myComputer = new Computer(1800, 3000, "2019");
        int result3 = myComputer.processTwoPlusTwo();
//        System.out.print(result3);
        System.out.println(myComputer.getId());

    }
}
