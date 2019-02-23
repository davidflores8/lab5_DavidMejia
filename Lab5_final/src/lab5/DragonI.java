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
public class DragonI extends c_legendaria{

    public DragonI() {
        nombre="Dragon infernal";
        velocidad="Media";
        objetivo="Aereos y terrestres";
        coste=4;
    }

    public DragonI(String nombre, String daño, String puntos_vida, String objetivo, String velocidad, int coste) {
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
}
