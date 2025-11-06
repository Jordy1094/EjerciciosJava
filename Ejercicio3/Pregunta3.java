package Ejercicio3;

// Pregunta3.java
// Autor: Jordy
// Práctica: Sobrecarga de Métodos, Manejo de Errores y Colecciones
// Ejercicio 3: Uso de ArrayList para almacenar y manipular nombres de estudiantes

import java.util.ArrayList;

public class Pregunta3 {

    public static void main(String[] args) {
        // Crear una lista dinámica de nombres (ArrayList de tipo String)
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar al menos 5 nombres
        nombres.add("María");
        nombres.add("José");
        nombres.add("Lucía");
        nombres.add("Carlos");
        nombres.add("Valeria");

        // Mostrar la lista completa
        System.out.println("Lista completa de estudiantes:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }

        // Eliminar el tercer nombre (índice 2, porque empieza desde 0)
        if (nombres.size() >= 3) {
            System.out.println("\nEliminando el tercer nombre ingresado: " + nombres.get(2));
            nombres.remove(2);
        }

        // Mostrar nuevamente la lista actualizada
        System.out.println("\nLista actualizada de estudiantes:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}
