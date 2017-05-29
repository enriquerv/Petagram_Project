package com.luisenrique.petagramandroid;

/**
 * Created by luisenrique on 27/05/2017.
 */

public class Mascota {
    private String nombre;
    private String calificacion;
    private String descripcion;
    private int foto;

    public Mascota(String nombre, String calificacion, String descripcion, int foto) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

