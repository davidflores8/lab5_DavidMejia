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
public class Lenador extends c_legendaria{

    public Lenador() {
        nombre="Leñador";
        velocidad="Baja";
        objetivo="Terrestres";
        coste=4;
        
    }
    
    public Lenador(String nombre, String daño, String puntos_vida, String objetivo, String velocidad, String coste) {
 
    }

    @Override
    public String toString() {
       return nombre;
    }
    
    
    
    
    
}
