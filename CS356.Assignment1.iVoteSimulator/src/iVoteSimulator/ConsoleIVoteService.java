/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iVoteSimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mirajpatel
 */
public class ConsoleIVoteService implements IVoteService {
    private Question question;
    private HashMap<String, ArrayList<String>> answerHash;
    
    public ConsoleIVoteService(Question q){
        this.question = q;
        this.answerHash = new HashMap<>();
    }
    
    public void submitAnswers(String sID, ArrayList<String> answer){
        Set<String> temp = new HashSet<>(answer);
        ArrayList<String> submission = new ArrayList<>();
        
        submission.addAll(temp);
        
        this.answerHash.put(sID, submission);
        System.out.println("Answer submitted");
    }
    
    public void showResults(){
        String results = "Q:\t";
        results += this.question.getQuestion() + "\n";
        
        ArrayList<String> options = this.question.getOptions();
        
        for(String option : options){
            int choiceCount = 0;
            for(String id : answerHash.keySet()){
                if(this.answerHash.get(id).contains(option)){
                    choiceCount++;
                }
            }
            results += option + "\t" + choiceCount +"\n";
        }
        
        System.out.println(results);
        
        
    }
}
