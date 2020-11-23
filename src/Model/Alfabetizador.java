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
public class Alfabetizador {
    public void alfabetizacion(Combinaciones comb, String[] splittedString){
        for(int i = 0; i < comb.getNumOfCombinations(); i++){
            System.out.println("" + splittedString[i]);
        }
    }
}
