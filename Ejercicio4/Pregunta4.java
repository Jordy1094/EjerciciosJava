package Ejercicio4;
// Pregunta4.java
// Autor: Jordy
// Práctica: Sobrecarga de Métodos, Manejo de Errores y Colecciones
// Ejercicio 4: Inventario interactivo con sobrecarga, validaciones y pausa en consola

import java.util.ArrayList;
import java.util.Scanner;

// Clase Producto
class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - S/ " + precio + " - Cantidad: " + cantidad;
    }
}

// Clase principal
public class Pregunta4 {

    private ArrayList<Producto> inventario = new ArrayList<>();

    // Sobrecarga 1: solo nombre
    public void agregarProducto(String nombre) {
        inventario.add(new Producto(nombre, 0.0, 0));
        System.out.println("✅ Producto agregado: " + nombre);
    }

    // Sobrecarga 2: nombre + precio
    public void agregarProducto(String nombre, double precio) {
        if (precio < 0) {
            System.out.println("⚠️ Error: El precio no puede ser negativo.");
            return;
        }
        inventario.add(new Producto(nombre, precio, 0));
        System.out.println("✅ Producto agregado: " + nombre + " - S/ " + precio);
    }

    // Sobrecarga 3: nombre + precio + cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            System.out.println("⚠️ Error: El precio y la cantidad deben ser positivos.");
            return;
        }
        inventario.add(new Producto(nombre, precio, cantidad));
        System.out.println("✅ Producto agregado: " + nombre + " - S/ " + precio + " - Cant: " + cantidad);
    }

    // Mostrar productos
    public void mostrarInventario() {
        System.out.println("\n📦 Inventario actual:");
        if (inventario.isEmpty()) {
            System.out.println("(No hay productos registrados)");
        } else {
            for (Producto p : inventario) {
                System.out.println("- " + p);
            }
        }
    }

    // Método para pausar la consola
    private static void pausar(Scanner sc) {
        System.out.print("\nPresione ENTER para continuar...");
        sc.nextLine();
    }

    // MAIN
    public static void main(String[] args) {
        Pregunta4 sistema = new Pregunta4();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n=== MENÚ DE INVENTARIO ===");
            System.out.println("1. Agregar producto (solo nombre)");
            System.out.println("2. Agregar producto (nombre y precio)");
            System.out.println("3. Agregar producto (nombre, precio y cantidad)");
            System.out.println("4. Mostrar inventario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            String input = sc.nextLine();

            try {
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = sc.nextLine();
                        sistema.agregarProducto(nombre);
                        pausar(sc);
                    }
                    case 2 -> {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el precio: ");
                        double precio = Double.parseDouble(sc.nextLine());
                        sistema.agregarProducto(nombre, precio);
                        pausar(sc);
                    }
                    case 3 -> {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el precio: ");
                        double precio = Double.parseDouble(sc.nextLine());
                        System.out.print("Ingrese la cantidad: ");
                        int cantidad = Integer.parseInt(sc.nextLine());
                        sistema.agregarProducto(nombre, precio, cantidad);
                        pausar(sc);
                    }
                    case 4 -> {
                        sistema.mostrarInventario();
                        pausar(sc);
                    }
                    case 0 -> System.out.println("👋 Saliendo del sistema...");
                    default -> System.out.println("⚠️ Opción inválida. Intente nuevamente.");
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Error: Ingrese un número válido.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
