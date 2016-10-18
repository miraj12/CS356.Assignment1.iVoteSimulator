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
public class SingleChoiceQuestion extends Question {
    
    public SingleChoiceQuestion(String question, ArrayList<String> options, ArrayList<String> correctAnswer) {
        super(question, options, correctAnswer);
    }
 
    // check if answer is correct
    @Override
    public boolean validateAnswer(ArrayList<String> answer) {
        // add more to validate if the answer is correct
        return this.getAnswers().get(0).compareTo(answer.get(0)) == 0;
    }
    
}
