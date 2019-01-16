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
public class Boletin_16 {

    public static void main(String[] args) {
        //Obxectos
        Persoa persoa = new Persoa();
        Canario canario = new Canario();
        Galo galo = new Galo();
        Tenor tenor=new Tenor();
        //Llamada a cada método
        persoa.cantar();
        galo.cantar();
        canario.cantar();
        tenor.cantar();
        //Obxecto Persoa que implementa a interfaz IPodeCantar:
        IPodeCantar obx = new Persoa();
        obx.cantar();

    }

}
