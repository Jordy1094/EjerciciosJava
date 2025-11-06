package Ejercicio05;
// Pregunta5.java
// Autor: Jordy
// Práctica: Sobrecarga de Métodos, Manejo de Errores y Colecciones
// Ejercicio 5: Manejo de múltiples excepciones con excepción personalizada

import java.util.Scanner;

// Excepción personalizada para números negativos
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class Pregunta5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== PROGRAMA DE VALIDACIÓN DE NÚMEROS ===");

        while (continuar) {
            try {
                System.out.print("\nIngrese un número entero: ");
                String entrada = sc.nextLine();

                // Validar si lo ingresado es un número
                int numero = Integer.parseInt(entrada);

                // Validar si el número es negativo
                if (numero < 0) {
                    throw new NumeroNegativoException("El número no puede ser negativo.");
                }

                // Si todo está bien:
                System.out.println("✅ Número válido ingresado: " + numero);

                // Preguntar si desea continuar
                System.out.print("\n¿Desea ingresar otro número? (s/n): ");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    continuar = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Error: Ingrese solo números enteros válidos.");
            } catch (NumeroNegativoException e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        }

        System.out.println("\n👋 Programa finalizado.");
        sc.close();
    }
}
