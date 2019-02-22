/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leonardo Banegas
 */
public class Usuarios {
    String nombre;
    String apellido;
    String user;
    String contraseña;
    Date fecha;
    int edad;
    Color color;
    ArrayList<Mazos>mazos=new ArrayList();

    public Usuarios(String nombre, String apellido, String user, String contraseña, Date fecha, int edad, Color color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Mazos> getMazos() {
        return mazos;
    }

    public void setMazos(ArrayList<Mazos> mazos) {
        this.mazos = mazos;
    }

    @Override
    public String toString() {
        return user;
    }
    
    
    
}
