/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iVoteSimulator;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mirajpatel
 */
public class SimulationDriver {
    
    public static void main(String[] args){
        
      
        
        Student[] students = new Student[30];
        
        
        ArrayList<String> multiOptions = new ArrayList<>();
        ArrayList<String> correctAns = new ArrayList<>();
       
       
        
        Question multiChoice = new MultipleChoiceQuestion("Select correct answers from the options",multiOptions,correctAns);
        
        multiOptions.add("A");
        multiOptions.add("B");
        multiOptions.add("C");
        multiOptions.add("D");
        
        correctAns.add(multiOptions.get(0));
        correctAns.add(multiOptions.get(2));
        
        ConsoleIVoteService serv1 = new ConsoleIVoteService(multiChoice);
        
        
       // first answer submit
        for(int i = 0; i < students.length; i++){
           students[i] = new Student();
           students[i].setAnswers(generateAnswers(multiOptions.size(),multiOptions));
           students[i].submit(serv1);
        }
       
        serv1.showResults();
        
        // some students resubmits answers
         for(int i = 0; i < students.length; i+=10){
           students[i].setAnswers(generateAnswers(multiOptions.size(),multiOptions));
           students[i].submit(serv1);
        }
        
        
        serv1.showResults();
        
        System.out.println("Total sumbmissions: " + Student.getCount() + "\n");
        
        //////////////////singleChoice//////////////////////
        
        ArrayList<String> option2 = new ArrayList<>();
        option2.add("yes");
        option2.add("no");
       
        ArrayList<String> opt2Ans = new ArrayList<>();
        opt2Ans.add(option2.get(0));
        
        Question singleChoice = new SingleChoiceQuestion("Is CS fun?", option2, opt2Ans);
        ConsoleIVoteService serv2 = new ConsoleIVoteService(singleChoice);
        
        //first time answer submit
        for(int i = 0; i < students.length; i++){
           students[i].setAnswers(generateAnswers(option2.size(),option2));
           students[i].submit(serv2);
        }
       
       serv2.showResults();
       
       
       // some student resumbits answers
        for(int i = 0; i < students.length; i+=5){
           students[i].setAnswers(generateAnswers(option2.size(),option2));
           students[i].submit(serv2);
        }
       
        
        serv2.showResults();
    }
    
    public static ArrayList<String> generateAnswers(int numOfChoices, ArrayList<String> choices){
        Random rand = new Random();
        int numOfAns = 1;
        ArrayList<String> answer = new ArrayList<>();
        
        if(numOfChoices > 2){
            numOfAns = rand.nextInt(numOfChoices);
        }
        
        for (int i = 0; i < numOfAns; i++){
            answer.add(choices.get(rand.nextInt(numOfChoices)));
        }
        
        
        return answer;
    }
    
}
