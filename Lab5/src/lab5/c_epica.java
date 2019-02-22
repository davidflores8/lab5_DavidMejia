/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Leonardo Banegas
 */
public class c_epica extends Cartas{

    public c_epica(String nombre, int daño, String puntos_vida, String objetivo, String velocidad, int coste) {
        super(nombre, daño, puntos_vida, objetivo, velocidad, coste);
    }

    public c_epica() {
    }
    
    
    @Override
    public String toString() {
        return super.toString();
    }
}
