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
public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
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
     * Test of getFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        ViajeFamiliar instance = null;
        int expResult = 0;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testSetFamilia() {
        System.out.println("setFamilia");
        int familia = 0;
        ViajeFamiliar instance = null;
        instance.setFamilia(familia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descripcion method, of class ViajeFamiliar.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeFamiliar instance = null;
        String expResult = "";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeFamiliar.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeFamiliar instance = null;
        String expResult = "";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
