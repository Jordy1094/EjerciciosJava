package Ejercicio2;

// Pregunta2.java
// Autor: Jordy
// Práctica: Sobrecarga de Métodos, Manejo de Errores y Colecciones
// Ejercicio 2: Manejo de errores - Evitar división entre cero

import java.util.Scanner;

public class Pregunta2 {

    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        try {
            // Solicitar al usuario los dos números enteros
            System.out.print("Ingrese el primer número entero: ");
            int num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int num2 = sc.nextInt();

            // Intentar realizar la división
            int resultado = num1 / num2;

            // Mostrar el resultado
            System.out.println("Resultado de la división: " + resultado);

        } catch (ArithmeticException e) {
            // Captura si se intenta dividir entre cero
            System.out.println("Error: división entre cero no permitida");
        } catch (Exception e) {
            // Captura cualquier otro tipo de error inesperado
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            // Cerrar el Scanner para liberar recursos
            sc.close();
        }
    }
}
