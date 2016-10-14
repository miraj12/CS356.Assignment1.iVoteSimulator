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
public class SimulationDriver {
    
    public static void main(String[] args){
        
        
        ArrayList<String> multipleChoice = new ArrayList<String>();
        ArrayList<String> options = new ArrayList<String>();
        ArrayList<String> correctAns = new ArrayList<String>();
       
        Student stu1 = new Student();
        Student stu2 = new Student();
        
        
        options.add("A");
        options.add("B");
        options.add("C");
        options.add("D");
        
        ArrayList<String> option2 = new ArrayList<>();
        option2.add("yes");
        option2.add("no");
        
        ArrayList<String> opt2Ans = new ArrayList<>();
        opt2Ans.add(option2.get(0));
       
        correctAns.add(options.get(0));
        correctAns.add(options.get(2));
         Question multiChoice = new MultipleChoiceQuestion("Is it right?",options,correctAns);
         Question singleChoice = new SingleChoiceQuestion("Is it right?", option2, opt2Ans);
         
        ConsoleIVoteService serv1 = new ConsoleIVoteService(multiChoice);
        
        
        ArrayList<String> stuAns1 = new ArrayList<>();
        stuAns1.add("A");
        stuAns1.add("C");
        stu1.setAnswers(stuAns1);
        stu1.submit(serv1);
       
        ArrayList<String> stuAns2 = new ArrayList<>();
        stuAns2.add("B");
        stuAns2.add("C");
        stu2.setAnswers(stuAns2);
        stu2.submit(serv1);
       
        serv1.showResults();
        
       System.out.println("Student ID: " + stu1.getId());
       System.out.println("Student ID: " + stu2.getId());
        
        stuAns1.set(0, "B");
        stuAns1.set(1, "D");
        
        stu1.submit(serv1);
        serv1.showResults();
        
       System.out.println("Student ID: " + stu1.getId());
       System.out.println("Student ID: " + stu2.getId());
       
       ConsoleIVoteService serv2 = new ConsoleIVoteService(singleChoice);
       ArrayList<String> stuAns12 = new ArrayList<>();
       stuAns12.add("yes");
       stu1.setAnswers(stuAns12);
       stu1.submit(serv2);
       
       
       
       ArrayList<String> stuAns22 = new ArrayList<>();
       stuAns22.add("yes");
       stu2.setAnswers(stuAns22);
       stu2.submit(serv2);
       
       serv2.showResults();
        
        
        
    }
    
}
