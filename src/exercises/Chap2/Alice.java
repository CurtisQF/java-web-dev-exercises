package exercises.Chap2;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for?");
        String search = input.next();
        input.close();
        String[] split = sentence.split(search);

        if (sentence.toLowerCase().contains(search.toLowerCase())) {
            System.out.println("Search term found at index " + sentence.indexOf(search) + " with length " + search.length());
            System.out.println(split[0] + split[1]);
        } else {
            System.out.println("Search term NOT found.");
        }
    }
}
