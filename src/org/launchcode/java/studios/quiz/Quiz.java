package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

//Add questions
//Run or carry out the quiz
//Grade the quiz

public class Quiz {

    //Var
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberQuestionCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    //Const
    public Quiz () {

    }

    //Get-set

    //Methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //Loop through each question
        for (Question question : questions) {
            //Ask the question
            System.out.println(question.getTheQuestion());
            //Get the user answer
            String inputAnswer = this.getInputAnswer();
            //Check against the real answer, capture result
            boolean userCorrectOrIncorrect = question.checkAnswer(inputAnswer);
            //Tally number correct
            if(userCorrectOrIncorrect) {
                this.numberQuestionCorrect ++;
            }
        }

        //Grade
        double percentCorrect = 100 * ((double) this.numberQuestionCorrect / (double) this.questions.size());
        System.out.println(percentCorrect);
    }

    private String getInputAnswer() {
        String inputAnswer = scanner.nextLine();
        return inputAnswer;
    }
}
