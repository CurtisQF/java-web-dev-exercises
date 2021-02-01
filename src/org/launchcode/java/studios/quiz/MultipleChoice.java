package org.launchcode.java.studios.quiz;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class MultipleChoice extends Question {

    //Var

    //Const
    public MultipleChoice(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    //Get-set

    //Methods
    @Override
    public boolean checkAnswer(String inputAnswer) {
        //Expect an answer  to be A, B, etc.
        String actualAnswer = this.getTheAnswer();
        if (inputAnswer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

}
