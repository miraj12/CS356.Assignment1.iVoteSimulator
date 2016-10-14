/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iVoteSimulator;

import java.util.ArrayList;

/**
 *
 * @author mirajpatel
 */
public abstract class Question {
    private String question;
    private ArrayList<String> options;
    private ArrayList<String> correctAnswer;
    
    public Question(String question, ArrayList<String> options, 
            ArrayList<String> correctAnswer){
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return this.question;
    }
    /**
     * @return the options
     */
    public ArrayList<String> getOptions() {
        return this.options;
    }
    
    public ArrayList<String> getAnswers(){
        return this.correctAnswer;
    }
    
    public abstract ArrayList<String> showAnswer();
    public abstract boolean validateAnswer(ArrayList<String> answer);
    
    
}
