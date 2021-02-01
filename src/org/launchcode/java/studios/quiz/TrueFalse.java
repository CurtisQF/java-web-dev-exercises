package org.launchcode.java.studios.quiz;

import java.util.Scanner;

public class TrueFalse extends Question {

    //Var

    //Const

    public TrueFalse(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    //Get-set

    //Methods

    @Override
    public boolean checkAnswer(String inputAnswer) {
        //Expect true or false string
        String actualAnswer = this.getTheAnswer();
        if (inputAnswer.toLowerCase().equals(actualAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }

    }

}
