/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordetareas;

/**
 *
 * @author daw2
 */
public class tareas {
    
    private String nombre;
    private boolean completada;

    public tareas(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public String getDescripcion() {
        return nombre;
    }

    @Override
    public String toString() {
        return (completada ? "si " : "no ") + nombre;
    }
}
