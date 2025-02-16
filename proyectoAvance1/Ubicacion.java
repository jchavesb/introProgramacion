/*
 * @authors Jairo Chaves Brenes, Jessica Montero Obando, Wilson Blanco Hernandez
 * Date: Febrero 16, 2025
 * Proyecto Final - 1er adelanto.
 */

package com.mycompany.proyectofinaladelanto1;

public class Ubicacion {

    private String bioma;
    private int posicion;
    private Animal[] animales;
    
    // Atributos de clase
    public void setBioma(String bioma){
        this.bioma = bioma;
    } // Metodo para elegir un bioma.
    public String getBioma(){
        return this.bioma;
    } // Metodo para obtener el bioma elegido.
    public void setPosicion(int posicion){
        this.posicion = posicion;
    } // Metodo para elegir una posicion para el animal
    public int getPosicion(){
        return this.posicion;
    } // Metodo para obtener la posicion
    public Animal[] getAnimales(){
        return this.animales;
    } // Metodo para obtener los animales dentro de la ubicacion.

}
