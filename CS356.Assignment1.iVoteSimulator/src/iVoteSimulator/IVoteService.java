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
// interface for IVoteService can be implemented for console or web application
public interface IVoteService {
    public void submitAnswers(String sID, ArrayList<String> answer);
    public void showResults();
}
