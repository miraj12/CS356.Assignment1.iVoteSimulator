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
public class Student {
   private String ID;
   private static int count = 0;
   
   private ArrayList<String> answers;
   
   public Student(){
       count++;
       this.ID = "110456278" + count;
   }
   
   public String getId(){
       return this.ID;
   }
   public static int getCount(){
       return count;
   }
    public boolean setAnswers(ArrayList<String> entry){
        this.answers = entry;
        return true;
    }
    
    public boolean submit(ConsoleIVoteService iVote){
        if(this.answers == null)
            return false;
        else {
             iVote.submitAnswers(this.ID, this.answers);
             return true;
        }
        
    }
    
}
