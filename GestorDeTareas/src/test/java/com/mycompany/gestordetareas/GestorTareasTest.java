/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gestordetareas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author daw2
 */
public class GestorTareasTest {
    
    public GestorTareasTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of agregarTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testAgregarTarea() {
        System.out.println("agregarTarea");
        String descripcion = "";
        GestorTareas instance = new GestorTareas();
        instance.agregarTarea(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTareas method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testListarTareas() {
        System.out.println("listarTareas");
        GestorTareas instance = new GestorTareas();
        instance.listarTareas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marcarComoCompletada method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testMarcarComoCompletada() {
        System.out.println("marcarComoCompletada");
        int indice = 0;
        GestorTareas instance = new GestorTareas();
        instance.marcarComoCompletada(indice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testEliminarTarea() {
        System.out.println("eliminarTarea");
        int indice = 0;
        GestorTareas instance = new GestorTareas();
        instance.eliminarTarea(indice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
