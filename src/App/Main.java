/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Model.Alfabetizador;
import Model.Combinaciones;
import Model.Entrada;
import Model.Separacion;

/**
 *
 * @author LEFT4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada ent = new Entrada("La Casa Azul");
        Separacion s = new Separacion();
        Combinaciones comb = new Combinaciones();
        Alfabetizador alf = new Alfabetizador();
        
        s.splitTheString(ent);
        comb.setNumOfCombinations(s);
        alf.alfabetizacion(comb, s.getSplittedString());
        
    }
    
}
