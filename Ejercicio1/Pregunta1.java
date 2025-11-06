// Pregunta1.java
// Autor: [Tu nombre o usuario GitHub]
// Práctica: Sobrecarga de Métodos, Manejo de Errores y Colecciones
// Ejercicio 1: Sobrecarga de métodos en Java

// Clase principal que contiene los métodos sobrecargados
public class Pregunta1 {

    // Método 1: sumar dos números enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método 2: sumar tres números enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método 3: sumar dos números decimales (double)
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método main para probar los tres métodos
    public static void main(String[] args) {
        // Crear objeto de la clase Pregunta1
        Pregunta1 calc = new Pregunta1();

        // Demostración de cada método
        int sumaEnteros = calc.sumar(5, 10);
        int sumaTresEnteros = calc.sumar(2, 4, 6);
        double sumaDecimales = calc.sumar(3.5, 2.8);

        // Mostrar resultados en consola
        System.out.println("Suma de dos enteros (5 + 10): " + sumaEnteros);
        System.out.println("Suma de tres enteros (2 + 4 + 6): " + sumaTresEnteros);
        System.out.println("Suma de dos decimales (3.5 + 2.8): " + sumaDecimales);
    }
}
