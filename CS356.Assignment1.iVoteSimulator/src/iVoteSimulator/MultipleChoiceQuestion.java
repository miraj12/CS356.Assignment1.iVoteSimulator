/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iVoteSimulator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mirajpatel
 */
public class MultipleChoiceQuestion extends Question {
    
    public MultipleChoiceQuestion(String question, ArrayList<String> options, ArrayList<String> correctAnswer) {
        super(question, options, correctAnswer);
    }

    @Override
    public ArrayList<String> showAnswer() {
         return this.getAnswers();
    }

    @Override
    public boolean validateAnswer(ArrayList<String> answer) {
       // add more to validate if answer is correct
       final Set<String> s1 = new HashSet<>(answer);
       final Set<String> s2 = new HashSet<>(this.getAnswers());
       
       return s1.equals(s2);
    }
    
    
    
}
