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
public class Golem extends c_epica{

    public Golem(String nombre, String daño, String puntos_vida, String objetivo, String velocidad, String coste) {
        
    }

    public Golem() {
        nombre="Golem";
        velocidad="Baja";
        objetivo="Terrestres";
        coste=8;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
    
}
