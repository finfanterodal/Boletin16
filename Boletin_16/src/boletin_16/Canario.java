/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;

/**
 *
 * @author finfanterodal
 */
public class Canario implements IPodeCantar {
//Implementamos los métodos abstractos de la Interfaz IPodeCantar.
    @Override
    public void cantar() {
         System.out.println("Pi,Pi,Pi,Pi");
    }
    
}
