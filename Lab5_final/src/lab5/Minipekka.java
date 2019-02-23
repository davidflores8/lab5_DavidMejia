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
public class Minipekka extends c_especial{

    public Minipekka(String nombre, String daño, String puntos_vida, String objetivo, String velocidad, String coste) {
        
    }

    public Minipekka() {
        nombre="Minipekka";
        velocidad="alta";
        objetivo="Terrestres";
        coste=4;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
}
