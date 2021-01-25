package exercises.Chap3;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printOddNumbers();
        arrayPractice.splitStringSentences();
    }

    public void printOddNumbers() {
        int[] array = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }

    public String[] splitString(){
        String string = "I would not, could not, in a box. I would not, could not with a fox. " +
            "I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = string.split(" ");
//        System.out.println(java.util.Arrays.toString(stringArray));
        return stringArray;
    }

    public void splitStringSentences(){
        String string = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = string.split("\\.");
        System.out.println(java.util.Arrays.toString(stringArray));
    }

}
