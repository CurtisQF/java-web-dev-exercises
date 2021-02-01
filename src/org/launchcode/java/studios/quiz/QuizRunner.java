package org.launchcode.java.studios.quiz;

public class QuizRunner {

    public static void main(String[] args) {

        Quiz myQuiz = new Quiz();

        MultipleChoice myMultipleChoice = new MultipleChoice("Which day begins the week?\nA.Saturday\nB.Monday\nC.Sunday\n(Reply with a single letter)","c");
        myQuiz.addQuestion(myMultipleChoice);

        Checkbox myCheckbox = new Checkbox("Which are weekdays?\nA.Tuesday\nB.Friday\nC.Sunday\n(Reply with one or more single letters)","ab");
        myQuiz.addQuestion(myCheckbox);

        TrueFalse myTrueFalse = new TrueFalse("Is Wednesday the middle of the week?\n(Reply with 'true' or 'false')","true");
        myQuiz.addQuestion(myTrueFalse);

        myQuiz.runQuiz();
    }
}
