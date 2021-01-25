package org.launchcode.java.studios.countingcharacters;

import java.util.*;

public class CharacterCounter {
    //Variables

    //Constructors
    public CharacterCounter() {

    }

    //Methods
    public void countCharacters(String wordToCount) {

        //Make supplied string case-insensitive
        wordToCount = wordToCount.toLowerCase();

        char[] arrayOfChars = wordToCount.toCharArray();
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        for (int i = 0; i < arrayOfChars.length; i ++) {

            //Exclude non-alpha characters
            if(Character.isLetter(arrayOfChars[i]) == false) {
                //Exclude
                continue;
            }

            // Add/update count of each character into the hash map
            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {
                //Does NOT yet contain key:
                myCharacterCount.put(theCharacter, 1);
            } else {
                // DOES contain key:
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue += 1;
                myCharacterCount.put(theCharacter, theValue);
            }
        }
        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for (int i = 0; i < myCharacterKeys.size(); i ++) {
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ": " + theValue);
        }
    }

    public String getUserInput() {
        Scanner myScanner = new Scanner(System.in);
        String myUsersInput = myScanner.nextLine();
        myScanner.close();
        return myUsersInput;
    }

////    What we accomplished with studio group:
//    public static void main(String[] args){
//
//        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
////        char[] charactersInString = text.toCharArray();
//        String[] charactersInString = text.split("");
//        HashMap<String, Integer> count = new HashMap<>();
//
//        System.out.println(Arrays.toString(charactersInString));
//
//        for (int i=0; i < charactersInString.length; i ++) {
//            count.put(charactersInString[i], 0);
//        }
//        for (Map.Entry<String, Integer> character : count.entrySet()) {
//            System.out.println(character.getKey() + " " + character.getValue());
//        }
////
////        for (Map.Entry(String, Integer) singleCharacter : count.entrySet()) {
////            if (singleCharacter.getKey().equals(charactersInString));
////        }


}
