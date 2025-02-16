/*
 * @authors Jairo Chaves Brenes, Jessica Montero Obando, Wilson Blanco Hernandez
 * Date: Febrero 16, 2025
 * Proyecto Final - 1er adelanto.
 */

package com.mycompany.proyectofinaladelanto1;

public class ProyectoFinalAdelanto1 {

   public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido sistema de gestión de zoológico. \nIngrese los datos solicitados.");
        Zoologico zoo = identificarZoologico();
        MenuPrincipal(zoo);
    }
	
	//Metodo para captura de datos iniciales del zoologico
	private static Zoologico identificarZoologico(){
        String nombre = JOptionPane.showInputDialog("Nombre del zoologico");
        String localidad = JOptionPane.showInputDialog("Digite la localidad");
        int capacidadmax = Integer.parseInt(JOptionPane.showInputDialog("Digite capacidad maxima de animales"));
        return new Zoologico(nombre, localidad, capacidadmax);
    }
    
	//Controlador del menu principal y las respectivas invocaciones de funcionalidades.
    private static void MenuPrincipal(Zoologico zoo){
        int opcion = 0;
        int posicion = 0;
        String nombreanimal = "";
        Animal animal = new Animal("","",0);
        animal.toString();
        
        String menu = """
                      Seleccione la opción deseada:
                      1. Agregar animal
                      2. Eliminar animal
                      3. Reubicar animal
                      4. Buscar animal
                      5. Generar reporte de animales
                      6. Salir
                      """;
        while (true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion){
                case 1 -> zoo.agregarAnimal(animal);
                case 2 -> zoo.eliminarAnimal(nombreanimal);
                case 3 -> zoo.reubicarAnimal(animal, posicion);
                case 4 -> zoo.buscarAnimales(nombreanimal);
                case 5 -> zoo.reporteDeAnimales();
                case 6 -> {JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema, vuelva pronto.");
                            System.exit(0);}
                default -> JOptionPane.showMessageDialog(null, "Opción incorrecta, por favor intente nuevamente");
            }
        }
        
    }
}
