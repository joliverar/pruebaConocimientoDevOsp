/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestordetareas;

import java.util.Scanner;
/**
 *
 * @author daw2
 */

public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    gestor.agregarTarea(descripcion);
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    gestor.listarTareas();
                    System.out.print("Ingrese el número de la tarea a completar: ");
                    int completar = scanner.nextInt() - 1;
                    gestor.marcarComoCompletada(completar);
                    break;
                case 4:
                    gestor.listarTareas();
                    System.out.print("Ingrese el número de la tarea a eliminar: ");
                    int eliminar = scanner.nextInt() - 1;
                    gestor.eliminarTarea(eliminar);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

    
    

