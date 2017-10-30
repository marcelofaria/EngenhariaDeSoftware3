/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OTAVIO-Note
 */
public class DiaDaSemanaTest {
    
    public DiaDaSemanaTest() {
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
     * Test of values method, of class DiaDaSemana.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        DiaDaSemana[] expResult = null;
        DiaDaSemana[] result = DiaDaSemana.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class DiaDaSemana.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        DiaDaSemana expResult = null;
        DiaDaSemana result = DiaDaSemana.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
