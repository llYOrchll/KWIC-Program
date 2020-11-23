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
    
    public int getNumOfCombinations(Separacion s){
        int numOfCombinations = 0;
        numOfCombinations = s.getSplittedString().length;
        return numOfCombinations;
    }
}
