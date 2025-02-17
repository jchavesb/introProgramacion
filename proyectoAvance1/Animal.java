/*
 * @authors Jairo Chaves Brenes, Jessica Montero Obando, Wilson Blanco Hernandez
 * Date: Febrero 16, 2025
 * Proyecto Final - 1er adelanto.
 */

package com.mycompany.proyectofinaladelanto1;

public class Animal {
    private String nombre;
    private String especie;
    private int edad;
    
    public Animal(String nombre, String especie, int edad) {
        // Constructor
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String getNombre() {
       // Método para obtener nombre del animal
       return this.nombre;
    }

    public String getEspecie() {
        // Método para obtener la especie de animal
        return this.especie;
    }

    public int getEdad() {
        // Método para obtener la especie de animal
        return this.edad;
    }
    
    public void setEdad(int edad) {
        // Método para obtener la edad del animal
        this.edad = edad;
    }
    @override
    public String toString() {
	//Método para obtener el detalle completo del animal
	return "Nombre: " + this.nombre + " Especie: " + this.especie + " Edad: " + this.edad;
    }
}
