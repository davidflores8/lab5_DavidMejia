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
class Mazos {
    String nombre;
    int coste;
    Cartas carta1;
    Cartas carta2;
    Cartas carta3;

    public Mazos(String nombre, int coste, Cartas carta1, Cartas carta2, Cartas carta3) {
        this.nombre = nombre;
        this.coste = coste;
        this.carta1 = carta1;
        this.carta2 = carta2;
        this.carta3 = carta3;
    }
    
    

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public Cartas getCarta1() {
        return carta1;
    }

    public void setCarta1(Cartas carta1) {
        this.carta1 = carta1;
    }

    public Cartas getCarta2() {
        return carta2;
    }

    public void setCarta2(Cartas carta2) {
        this.carta2 = carta2;
    }

    public Cartas getCarta3() {
        return carta3;
    }

    public void setCarta3(Cartas carta3) {
        this.carta3 = carta3;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
