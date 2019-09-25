/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.tallerpoliforfismo.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INGESIS
 */
public class ClienteMainTest {
    
    public ClienteMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ClienteMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ClienteMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerViajes method, of class ClienteMain.
     */
    @Test
    public void testLeerViajes() {
        System.out.println("leerViajes");
        ClienteMain.leerViajes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarViajes method, of class ClienteMain.
     */
    @Test
    public void testMostrarViajes() {
        System.out.println("mostrarViajes");
        ClienteMain.mostrarViajes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
