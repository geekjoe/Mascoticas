package com.evoldig.mascoticas;

/**
 * Created by jazocar on 20/9/16.
 */
public class Mascotas {

    private String nombre;
    private int foto;
    private String raiting;



    // private int like;



    public Mascotas(String nombre, int foto, String  raiting) {
        this.nombre = nombre;
        this.foto = foto;
        this.raiting = raiting;
     //   this.like = like;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getRaiting() {return raiting;}

    public void setRaiting (String raiting) {this.raiting = raiting;}

   /* public int getLike() {return like;}

    public void setLike(int like) {this.like = like;} */

}
