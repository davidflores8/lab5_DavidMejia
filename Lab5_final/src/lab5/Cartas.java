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
public class Cartas {
    String nombre;
    int daño;
    String puntos_vida;
    String objetivo;
    String velocidad;
    int coste;
    String tipo;
    public Cartas() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cartas(String nombre, int daño, String puntos_vida, String objetivo, String velocidad, int coste) {
        this.nombre = nombre;
        this.daño = daño;
        this.puntos_vida = puntos_vida;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.coste = coste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public String getPuntos_vida() {
        return puntos_vida;
    }

    public void setPuntos_vida(String puntos_vida) {
        this.puntos_vida = puntos_vida;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
