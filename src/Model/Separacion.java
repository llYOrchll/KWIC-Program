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
public class Separacion {
    
    String[] splittedString;
    
    public void splitTheString(Entrada e){
        String[] splittedString = e.getInputStr().split(" ");
        setSplittedString(splittedString);      
    }

    public String[] getSplittedString() {
        return splittedString;
    }

    public void setSplittedString(String[] splittedString) {
        this.splittedString = splittedString;
    }
    
}
