package org.launchcode.java.studios.quiz;

public abstract class Question {

    //Var
    private final String theQuestion;
    private final String theAnswer;

    //Const
    public Question (String theQuestion, String theAnswer) {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
    }

    //Get-set

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    //Methods
    public abstract boolean checkAnswer(String answer);
}
