package org.ieselcaminas.alu53787365w.elsol;

/**
 * Created by alu53787365w on 18/11/16.
 */

public class Planeta {
    String nombre;
    double diametro;
    double distancia;
    int densidad;

    public Planeta(String nombre, double diametro, double distancia, int densidad) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.distancia = distancia;
        this.densidad = densidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getDensidad() {
        return densidad;
    }

    public void setDensidad(int densidad) {
        this.densidad = densidad;
    }
}
