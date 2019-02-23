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
public class Dragon extends c_epica{

    public Dragon() {
        nombre="Dragon infernal";
        velocidad="Media";
        objetivo="Aereos";
        coste=4;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
