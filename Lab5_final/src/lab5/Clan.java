/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leonardo Banegas
 */
public class Clan {
    String nombre;
    ArrayList<Usuarios>miembros=new ArrayList();
    Date fecha_creacion;
    Usuarios lider;
    String tipo;

    public Clan(String nombre, Date fecha_creacion, Usuarios lider, String tipo) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuarios> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuarios> miembros) {
        this.miembros = miembros;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Usuarios getLider() {
        return lider;
    }

    public void setLider(Usuarios lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
