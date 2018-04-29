package org.ieselcaminas.alu53787365w.elsol;

/**
 * Created by alu53787365w on 18/11/16.
 */

public class Imagen {
    private int imagen;
    private String titulo;

    public Imagen(int imagen, String titulo) {
        this.imagen = imagen;
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
