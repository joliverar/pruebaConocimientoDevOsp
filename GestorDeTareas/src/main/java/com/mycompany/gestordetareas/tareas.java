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
    
    private String descripcion;
    private boolean completada;

    public tareas(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return (completada ? "si " : "no ") + descripcion;
    }
}
