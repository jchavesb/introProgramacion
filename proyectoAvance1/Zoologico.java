/*
 * @authors Jairo Chaves Brenes, Jessica Montero Obando, Wilson Blanco Hernandez
 * Date: Febrero 16, 2025
 * Proyecto Final - 1er adelanto.
 */

package com.mycompany.proyectofinaladelanto1;

public class Zoologico {
    private String nombre;
    private String localidad;
    private int capacidadMaxima;
    private Animal[] animal;
    private int cantAnimales;
      
    public Zoologico(String nombreZoologico, String localidad, int capacidadMaxima) {
       // Constructor
       this.nombre = nombreZoologico;
       this.localidad = localidad;
       this.capacidadMaxima = capacidadMaxima;
       this.animal = new Animal[capacidadMaxima];
       this.cantAnimales = 0;       
    }

    public String getNombre() {
        // Método para obtener nombre del zoo
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        // Método para agregar nombre del zoológico
        this.nombre = nombre;
    }
    
    public String getLocalidad() {
        // Método para obtener localidad
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        // Método para agregar localidad
        this.localidad = localidad;
    }
    
    public void setCapacidadMaxima(int capacidad) {
        // Método para agregarcapacidad max
        this.capacidadMaxima = capacidad;
    }
    
    public int getCapacidadMaxima() {
        // Método obtener agregarcapacidad max
        return capacidadMaxima;
    }
    
    public void agregarAnimal(Animal animal) {
       // Métodos para agregar y eliminar animales
    }

    public void eliminarAnimal(String nombre) {
       // Método para eliminar los animales en el zoológico
    }

    public void mostrarAnimales() {
        // Método para mostrar los animales en el zoológico
    }
    
    public void reporteDeAnimales() {
        // Método para hacer reporte de animales existentes en el zoológico
    }
    
    public void buscarAnimales(String Animal) {
        // Método para buscar animales
    }
    
    public void reubicarAnimal(Animal animal, int posicion) {
        // Método para reubicar animal
    }
}
