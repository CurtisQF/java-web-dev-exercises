package org.launchcode.java.studios.quiz;

public class Checkbox extends Question {

    //Var

    //Const
    public Checkbox(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    //Get-set

    //Methods

    @Override
    public boolean checkAnswer(String inputAnswer) {
        // answer = A, B, C
        String actualAnswer = this.getTheAnswer();
        if (inputAnswer.toLowerCase().equals(actualAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
