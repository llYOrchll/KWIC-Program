/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LEFT4
 */
public class Combinaciones {
    int numOfCombinations;
    public void setNumOfCombinations(Separacion s){
        numOfCombinations = s.getSplittedString().length;
    }
    
    public int getNumOfCombinations(){
        return numOfCombinations;
    }
}
